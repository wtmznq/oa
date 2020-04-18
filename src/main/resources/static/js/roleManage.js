layui.extend({
    dtree: '/lib/layui_ext/dtree/dtree'   // {/}的意思即代表采用自有路径，即不跟随 base 路径
}).use(['element', 'form','table','jquery','layer','dtree'],function () {
  var form = layui.form,
      dtree = layui.dtree,
      $ = layui.jquery,
      layer = layui.layer,
      element = layui.element,
      table = layui.table;

  /**
   * 数据表格初始化
   */
  table.render({
    elem: '#myTable',
    url: '/roleInfo/init',
    page: true,
    cols: [[
      {field: 'roleid',hide:true}
      ,{field: 'rolename',title: '角色名称',edit: 'text'}
      ,{field: 'roledesc',title: '角色说明',edit: 'text'}
      ,{field: 'right',title: '操作',toolbar:'#barDemo'}
    ]]
  });

    /**
     * 监听工具栏
     */
  table.on('tool(myTable)',function (obj) {
        var data = obj.data;//获取当前行的数据
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）

      if (layEvent === 'del'){
          layer.confirm('是否删除?', {icon: 3, title:'提示'}, function(index){
              $.post('/roleInfo/del',{'roleId':data.roleid});
              table.reload('myTable', {
                  url: '/roleInfo/init'
              });
              layer.msg('删除成功');
              layer.close(index);
          });
      }else if (layEvent === 'allocation'){
          layer.open({
              title: '分配权限',
              type: 1,
              area: ['581px','506px'],
              btn: ['修改', '取消'],
              content: $("#myTree"),
              success: function (layero, index) {
                  dtree.render({
                      elem: "#dataTree",
                      method: 'GET',
                      request:{'roleid':data.roleid},
                      url: "/Sysfun/load",
                      dataStyle: "layuiStyle",  //使用layui风格的数据格式
                      dataFormat: "list",  //配置data的风格为list
                      response:{message:"msg",statusCode:0},  //修改response中返回数据的定义
                      checkbar:true
                  });
              },
              yes: function (index,layero) {
                  layer.confirm('是否修改', function(index){
                      var params = dtree.getCheckbarJsonArrParam("dataTree");
                      $.post('/Roleright/update',{'roleid':data.roleid,'node':JSON.stringify(params.nodeId)})
                      layer.close(index);
                  });
              }
          })
      }
  })



  //监听单元格编辑
    table.on('edit(myTable)', function(obj){ //注：edit是固定事件名，test是table原始容器的属性 lay-filter="对应的值"
        let data=obj.data //所在行的所有相关数据
        $.post('/roleInfo/update',data);
    });


  //添加用户信息
  $("#add").click(function () {
      layer.open({
        title: '添加角色'
        ,area: ['802px','303px']
        ,content: `<div><form id="addForm" action="" class="layui-form">
      <div class="layui-form-item">
        <label class="layui-form-label">角色名称</label>
        <div class="layui-input-block">
          <input type="text" name="rolename" class="layui-input">
        </div>
      </div>
      <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">角色说明</label>
        <div class="layui-input-block">
          <textarea placeholder="请输入内容" name="roledesc" class="layui-textarea"></textarea>
        </div>
      </div>
    </form></div>`
        ,shade: 0.8
        ,id: 'addRole'
        ,btn: ['添加', '取消']
        ,yes: function (index,layero) {
            $.ajax({
                type: "POST",
                url: "/roleInfo/add",
                data: $("#addForm").serialize()
            });
            layer.msg('添加成功');
            table.reload('myTable', {
                  url: '/roleInfo/init'
            });
            layer.close(index);
        }
      })
  })

})
s