fun main(args: Array<String>) {
    print("""Введите тип карты ("Visa","Мир","Mastercard","Maestro","VK Pay"): """)
    var card = readLine()!!.toString()
    print("Введите сумму перевода: ")
    var amount = readLine()!!.toDouble()
    var result = 0.0
    if (card == "Mastercard" || card == "Maestro") {
        if (amount >= 300 && amount <= 75000) result = amount else result = (amount * 0.06 + 20) + amount
    } else if (card == "Visa" || card == "Мир") {
        if (amount * 0.75 < 35) result = amount + 35.0 else result = amount * 0.75 + amount
    } else result = amount
    print("Введите сумму переводов в этом месяце: ")
    var limit = readLine()!!.toDouble()
    limit = limit + amount
    if (card == "VK Pay") {
        if (amount > 15_000 || limit < 40_000) println("Перевод невозможен.") else println(result)
    }
    else   {
        print("Введите сумму переводов сегодня: ")
        var amountAtDay = readLine()!!.toDouble()
        amountAtDay += amount
        if (limit > 600000 || amountAtDay > 150000) println("Перевод невозможен.") else println(result)
    }




}
