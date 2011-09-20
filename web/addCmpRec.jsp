<%-- 
    Document   : addCmpRec
    Created on : Sep 20, 2011, 7:12:40 PM
    Author     : A187252
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Add New Air Frame Component Record </title>
    </head>
    <body>
        <h1>Add New Air Frame Component Record</h1>
        
        <form name="myForm" action="/addCmpRec" method="get">
            <h4>Basic Details</h4>
            <table>
                <tr>
                    <td>Component Name</td><td><input name="cmpName" type="text"/></td>
                </tr>
                <tr>
                    <td>Part Number</td><td><input name="partNum" type="text"/></td>
                </tr>
                <tr>
                    <td>Serial Number</td><td><input name="srNum" type="text"/></td>
                </tr>
                <tr>
                    <td>Finite Life Hrs</td><td><input name="flHrs" type="text"/></td>
                </tr>
            </table>
            <h4>Installation Details</h4>
            <table>
                 <tr>
                    <td>Life Remaining Hrs</td><td><input name="lrInstHrs" type="text"/></td>
                 </tr>
                 <tr>
                    <td>Installation A/F Hrs</td><td><input name="afInstHrs" type="text"/></td>
                 </tr>
                 <tr>
                    <td>Installation Date</td><td><input name="InstDate" type="text"/></td>
                 </tr>
                 <tr>
                    <td>Installation Due Hrs</td><td><input name="InstDueHrs" type="text"/></td>
                 </tr>
            </table>
            <h4>Current Component Details</h4>
            <table>
                <tr>
                    <td>Current A/F Hrs</td><td><input name="crAFHrs" type="text"/></td>
                </tr>
                <tr>
                    <td>Remaining Life Hrs</td><td><input name="rLifeHrs" type="text"/></td>
                </tr>
                <tr>
                    <td>Remarks</td><td><input name="remtext" type="text"/></td>
                </tr>
                
            </table>
            <br/>
            <input type="submit" value="Add Component" style="margin-left: 90px" />
        </form>
        
    </body>
</html>
