$(document).ready(function () {
    $(".context-tietle").hover(function () {
       $(this).find(".context-tietle-time").css("background-color","white");
    })
    $(".context-tietle").mouseleave(function () {
        $(this).find(".context-tietle-time").css("background-color","#89c4e980");
    })
})