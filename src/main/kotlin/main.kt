fun main() {

//    Задача №1. Денежные переводы
    val minCommiss = 35.0
    val percent = 0.75
    val amount = 5_000.0
    val commissPerc: Double = amount * percent / 100
    val comission: Double = if (commissPerc > 35.0) commissPerc else 35.0
    println("При переводе " + amount + " руб. комиссия составит " + comission + " руб.")

//    Задача №2. Люди/Человеки
    val likes = 1
    val ending: String = if (likes == 1 || likes % 10 == 1 && likes != 11) "человеку" else "людям"
    println("Понравилось " + likes + " " + ending)

//    Задача №3. Меломан
    val spentOnMusic = 1_002.0 /*сумма потраченная на музыку*/
    val spentLastMonth = 0.01 /*Переменная, если покупал в прошлом месяце - 0.01, если нет - 0*/
    val sumOnMusic: Double = if (spentOnMusic < 1_001) 0.0 else spentOnMusic /*исключение сумм до 1001*/
    val spentDiscount: Double =
        if (sumOnMusic >= 1_001 && sumOnMusic < 10_001) 100.0 else (sumOnMusic * 0.05) /*скидка с суммы*/
    val lustMonthDiscount: Double = spentOnMusic * spentLastMonth /*скидка за покупку в прошлом месяце*/
    println("Ваша скидка составила: " + (spentDiscount + lustMonthDiscount) + " руб.")

}
