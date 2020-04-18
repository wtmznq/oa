layui.use(['form','table','jquery','laydate'],function () {
    const form = layui.form,
        table = layui.table,
        laydate = layui.laydate;
    $ = layui.jquery;

    laydate.render({
        elem: '#startTime' //指定元素
    });
    laydate.render({
        elem: '#endTime' //指定元素
    });

    /**
     * 数据表格初始化
     */
    init();
    function init(){
        table.render({
            elem: '#myTable',
            url: '/operateLog/load',
            where: {'startTime':$("#startTime").val(),'endTime':$("#endTime").val()},
            page: true,
            toolbar: '#toolbarDemo',
            cols: [[
                {type: 'checkbox', fixed: 'left'}
                ,{field: 'id',type:'numbers',title: '序号'}
                ,{field: 'operateId',title: '操作id'}
                ,{field: 'userName',title: '操作用户',width: 102}
                ,{field: 'operateName',title: '事件',width:250}
                ,{field: 'operateDesc',title: '操作描述',width: 308}
                ,{field: 'operateTime',title: '操作时间',width: 137}
            ]],
            done: function(res, curr, count){
                $("[data-field=operateId]").css('display','none');
                $("[data-field='ifSuccess']").children().each(function () {
                    if ($(this).text()==='1'){
                        $(this).text("是");
                    }else if ($(this).text()==='0'){
                        $(this).text("否");
                    }
                })
            }
        });
    }

    /**
     * 头部工具栏监听事件
     */
    table.on('toolbar(myTable)', function(obj){
        var checkStatus = table.checkStatus(obj.config.id);
        switch(obj.event){
            case 'del':
                // console.log(JSON.stringify(checkStatus.data))
                layer.confirm('是否删除?', {icon: 3, title:'提示'}, function(index){
                    $.get('/loginLog/del',{'log':JSON.stringify(checkStatus.data)})
                    init();
                    layer.msg('删除成功');
                    layer.close(index);
                });
                break;
        };
    });

    form.on('submit(search)', function(data){
        init();
        return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
    });

})