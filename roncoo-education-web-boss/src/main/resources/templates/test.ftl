<html>
<head>
    <title>我的第一个网页模板</title>
</head>
<body>
${name},你好。${message}

<#assign linkman="周先生">
联系人：${linkman}
<br><br>

<#assign info={"mobile":"13301231212",'address':'北京市昌平区王府街'} >
电话：${info.mobile}  地址：${info.address}<br>
_____________________________________________________
<#include "head.ftl">

<br>
*******************************************************

<#if success=true>
你已通过实名认证
<#else>
你未通过实名认证
</#if>

<br>

^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

<#list goodsList as goods>
${goods_index+1} 商品名称： ${goods.name} 价格：${goods.price}<br>
</#list>
共  ${goodsList?size}  条记录


<br>

当前日期：${today?date} <br>
当前时间：${today?time} <br>
当前日期+时间：${today?datetime} <br>
日期格式化：  ${today?string("yyyy年MM月")}

<br>
<#if aaa??>
aaa变量存在
<#else>
aaa变量不存在
</#if>
</body>
</html>