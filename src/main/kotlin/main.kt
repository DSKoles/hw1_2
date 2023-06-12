fun main() {

//    Задача №1. Денежные переводы
    val minCommiss = 35.0
    val percent = 0.75
    val amount = 5_000.0
    val commissPerc: Double = amount * percent / 100
    val comission: Double = if (commissPerc > minCommiss) commissPerc else minCommiss /*заменил число на переменную*/
    println("При переводе " + amount + " руб. комиссия составит " + comission + " руб.")

//    Задача №2. Люди/Человеки
    val likes = 511
    val ending: String =
        if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
//        if (likes % 100 == 1 && likes != 11) "человеку" else "людям" /*удалил лишнее условие, скорректировал likes%100 все работает*/
    println("Понравилось " + likes + " " + ending)

//    Задача №3. Меломан
    val spentOnMusic = 10_002.0 /*сумма потраченная на музыку*/
    val spentLastMonth = 0.01 /*Переменная, если покупал в прошлом месяце - 0.01, если нет - 0*/
    val statusCustomer =
        "regular" /*статус покупателя. Постояннму покупателю нужно присвоить статус regular, если не постоянный - не заполнять*/
    val sumOnMusic: Double = if (spentOnMusic < 1_001) 0.0 else spentOnMusic /*исключение сумм до 1001*/
    val spentDiscount: Double =
        if (sumOnMusic >= 1_001 && sumOnMusic < 10_001) 100.0 else (sumOnMusic * 0.05) /*скидка с суммы*/
    val lastMonthDiscount: Double =
        if (statusCustomer == "regular") ((spentOnMusic - spentDiscount) * spentLastMonth) else 0.0 /*скидка за покупку в прошлом месяце от суммы покупок за вычетом скидки за сумму*/
    println("Ваша скидка составила: " + (spentDiscount + lastMonthDiscount) + " руб.")

}
