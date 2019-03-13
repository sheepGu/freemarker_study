<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <#assign myList=[1,6,2,8,3,4,7,10,5]/>
    <li>未排序</li>
    <#list myList as item>
        ${item}
    </#list>

    <li>已排序</li>
    <#list sort_int(myList,false) as item>
        ${item}
    </#list>

</div>
</body>
</html>