<%-- 
    Document   : addOPMRec
    Created on : Sep 25, 2011, 12:42:06 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Add New OPM Record</title>
    </head>
    <body>
        <h3>Add New OPM Record</h3>
       
        <form name="myForm" action="/AirDynasty/addOPMHrs">
        <select name="hrsType">
            <option value="A">Air Frame Hours</option>
            <option value="D">In Days</option>
            <option value="E">Engine Hours</option>
            <option value="N">Ng Cycles</option>
        </select>
        <table>
            <tr>
                <td>Nomenclature</td><td><input type="text" name="ncText"/></td>
            </tr>
            <tr>
                <td>Due A/F Hours</td><td><input type="text" name="dueAFhrs"/></td>
            </tr>
            <tr>
                <td>Due Engine Hours</td><td><input type="text" name="dueENGhrs"/></td>
            </tr>
            <tr>
                <td>Calender Due Date</td><td><input type="text" name="calDate"/></td>
            </tr>
        </table>
            
            <h3>Other Details</h3>
        <table>
        <tr>
            <td>Interval</td><td><input type="text" name="intvl"/></td>
        </tr>
        <tr>
            <td>Time Remain</td><td><input type="text" name="remTime"/></td>
        </tr>
        <tr>
            <td>Remarks</td><td><input type="text" name="remText"/></td>
        </tr>
        </table>
        <br/>
            <input type="submit" value="Submit"/>
          </form>
        
    </body>
</html>
