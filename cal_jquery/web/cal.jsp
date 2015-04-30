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
            var action = new Array();
            action[0] = "Talk";
            action[1] = "Play";
            action[2] = "Love";
            action[3] = "Work";
            action[4] = "Rest";

            // 버튼 클릭시 월 변환 코드
            $(document).ready(function() {
                $("#prev").click(function() {
                    $("#month").text(function(i, origMonth) {
                        month = Number(origMonth) - 1;
                        //랜덤 일정 변경
                        $("#sche").text(function() {
                            var randomAction = Math.floor(Math.random() * 5);
                            return action[randomAction];
                        });
                        //일정 변경 끝
                        return monthCheck(month);
                    });
                });

                $("#next").click(function() {
                    $("#month").html(function(i, origMonth) {
                        month = Number(origMonth) + 1;
                        //랜덤 일정 변경
                        $("#sche").text(function() {
                            var randomAction = Math.floor(Math.random() * 5);
                            return action[randomAction];
                        });
                        //일정 변경 끝
                        return monthCheck(month);
                    });
                });
            });

            //월(month) 체크. 1 아래, 12 위로 올라가지 않게함.
            function monthCheck(month) {
                if (month <= 1) {
                    return 1;
                } else if (month >= 12) {
                    return 12;
                } else {
                    return month;
                }
            }


            // 리로드 확인용 카운트 코드
            // 월이 변해도 카운트는 변하지 않음(리로드 되지 않음)
            function count_start() {
                time = setTimeout("count()", 1000);
            }

            function count() {
                var ti = document.all.count.value;
                ti = ti - 1;

                if (ti < 1) {
                    document.all.count.value = "end count";
                } else {
                    document.all.count.value = ti;
                    time = setTimeout("count()", 1000);
                }
            }
            count_start();
            //리로드 확인용 코드 끝

        </script>
    </head>
    <body>
        <input type ="text" name = "count" value = "10"><br>

        <p><button id="prev">prev</button> <label id="month">6</label>월 <button id="next">next</button></p>
        <p>일정 : <label id="sche"></label></p>
    </body>
</html>

