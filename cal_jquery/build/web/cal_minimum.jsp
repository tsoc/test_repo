<%-- 
    Document   : cal.jsp
    Created on : 2015. 4. 12, 오후 11:30:11
    Author     : TSOC
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- jquery 라이브러리, 적용이 되지 않을시 직접 다운로드해서 사용 -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script>
            
            // 버튼 클릭시 월 변환 코드
            $(document).ready(function() {
                $("#prev").click(function() {
                    $("#month").text(function(i, origMonth) {
                        return Number(origMonth) - 1;
                    });
                });

                $("#next").click(function() {
                    $("#month").html(function(i, origMonth) {
                        return Number(origMonth) + 1;
                    });
                });
            });
        </script>
    </head>
    <body>
        <p><button id="prev">prev</button> <label id="month">6</label>월 <button id="next">next</button></p>
    </body>
</html>

