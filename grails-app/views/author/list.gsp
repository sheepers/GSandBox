<%--
  Created by IntelliJ IDEA.
  User: Ofir
  Date: 22/01/13
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<html ng-app="plunker">
<head>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.3/angular.js"></script>
    <script src="http://angular-ui.github.com/bootstrap/ui-bootstrap-tpls-0.1.0-SNAPSHOT.js"></script>
    <g:javascript src="example.js"></g:javascript>
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css" rel="stylesheet">
</head>
<body>

<div ng-controller="AccordionDemoCtrl">
    <label class="checkbox">
        <input type="checkbox" ng-model="oneAtATime">
        Open only one at a time
    </label>

    <accordion close-others="oneAtATime">
        <accordion-group heading="author">

            <div>{fieldValue(bean: authorInstanceList, field: "name")}</div>
        </accordion-group>
        <accordion-group heading="{{group.title}}" ng-repeat="group in groups">
            {{group.content}}
        </accordion-group>
        <accordion-group heading="Dynamic Body Content">
            <p>The body of the accordion group grows to fit the contents</p>
            <button class="btn btn-small" ng-click="addItem()">Add Item</button>
            <div ng-repeat="item in items">{{item}}</div>
        </accordion-group>
    </accordion>
</div>
 </html>

