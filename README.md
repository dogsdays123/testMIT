# MIT STUDY
엠아이티교육원

# 승원의 공부 진행사항
1주차 ~ 25주차

# 1주차
<!DOCTYPE html> <!-- 타입이 html이라고 선언 -->
<html lang="ko"> <!-- 기본언어 검색언어가 korean이라고 설정 -->
    <head> <!--  -->
        <meta charset="UTF-8"> <!-- meta data를 UTF-8로 설정 = 한글이 깨지기 쉽기 때문에 필수 -->
        <title>HTML 기본 문서</title>
    </head>
    <header>
        <h1>웹 문서 만들기</h1> <!-- 머릿말 -->
        <hr> <!-- 머릿줄 -->
        <p>HTML</p> <!-- 기본내용 -->
        <div id="logo"> <!-- 콘텐츠를 나누는 division -->
            <nav> <!-- 네이게이션 탐색 링크 영역 -->
                <ul id="topmenu"> <!-- 순서가 없는 리스트 -->
                    <li><a href="#">1번 이동</a></li> <!-- ul의 아이템 / 목록의 항목 -->
        </div>
        <h2>
            <a href="https://github.com/dogsdays123/testMIT"> <!-- </a>에 포함된 아이템들을 하이퍼링크화-->
            <img src="images.jpg" alt="승원 깃허브 홈페이지" width="255"> </a> <!-- 이미지 불러오기 -->
        </h2>
        <table> <!-- 내용 테이블 -->
            <tr> <!-- 테이블 나누기(세로줄) -->
            <td>승원 깃허브 홈페이지</td> <!-- 나뉜 테이블의 가로줄 -->
            </tr>
        </table>
    </header>
    <body>
        <main class="contents"> <!-- 문서당 하나밖에 안되는 메인 콘텐츠 -->
            <section id="heading"> <!-- 섹션(세부 콘텐츠) -->
                <h2>몸과 마음이 치유되는 섬</h2>
            </section>
            <section id="activity">
                <h2>다양한 액티비티가 기다리는 섬</h2>
            </section>
        </main>
    </body>
</html>
