class Ahorcado() {

    var palabra: String = ""
        get() = field
        set(porpantalla) = run {
            field = porpantalla
        }


    var lista1 = arrayOf(
        mutableListOf("kiwi"),
        mutableListOf("manzana"),
        mutableListOf("pera"),
        mutableListOf("melocoton"),
        mutableListOf("platano"),
        mutableListOf("naranja"),
        mutableListOf("fresa"),
        mutableListOf("uva"),
        mutableListOf("mango"),
        mutableListOf("piña")
    )


    var lista2 = arrayOf(
        mutableListOf("tierra"),
        mutableListOf("marte"),
        mutableListOf("jupiter"),
        mutableListOf("pluton"),
        mutableListOf("saturno"),
        mutableListOf("venus"),
        mutableListOf("mercurio"),
        mutableListOf("neptuno"),
        mutableListOf("urano"),
        mutableListOf("sol")
    )

    var lista3 = mutableListOf(
        mutableListOf("messi"),
        mutableListOf("lamine yamal"),
        mutableListOf("cristiano"),
        mutableListOf("pedri"),
        mutableListOf("mbappe"),
        mutableListOf("haaland"),
        mutableListOf("vinicius"),
        mutableListOf("bellingham"),
        mutableListOf("neymar"),
        mutableListOf("suarez"),

        mutableListOf("benzema"),
        mutableListOf("modric"),
        mutableListOf("kroos"),
        mutableListOf("de bruyne"),
        mutableListOf("griezmann"),
        mutableListOf("lewandowski"),
        mutableListOf("salah"),
        mutableListOf("mane"),
        mutableListOf("kane"),
        mutableListOf("son"),

        mutableListOf("rodri"),
        mutableListOf("bernardo silva"),
        mutableListOf("foden"),
        mutableListOf("gundogan"),
        mutableListOf("osimhen"),
        mutableListOf("kvaratskhelia"),
        mutableListOf("martinelli"),
        mutableListOf("saka"),
        mutableListOf("odegaard"),
        mutableListOf("rashford"),

        mutableListOf("ronaldinho"),
        mutableListOf("ronaldo nazario"),
        mutableListOf("zidane"),
        mutableListOf("iniesta"),
        mutableListOf("xavi"),
        mutableListOf("pirlo"),
        mutableListOf("maldini"),
        mutableListOf("cannavaro"),
        mutableListOf("buffon"),
        mutableListOf("casillas"),

        mutableListOf("pele"),
        mutableListOf("maradona"),
        mutableListOf("cruyff"),
        mutableListOf("beckenbauer"),
        mutableListOf("eusebio"),
        mutableListOf("george best"),
        mutableListOf("garrincha"),
        mutableListOf("di stefano"),
        mutableListOf("platini"),
        mutableListOf("zico")
    )


    var fruta = false
    var planetas = false
    var futbolistas = false


    var palabraSeDebeAcertar = ""
    var palabraDesbloqueado = StringBuilder()

    init {
        var posibilidad = (1..3).toList()
        var numeroaleatorio = posibilidad.random()
        if (numeroaleatorio == 1) {
            this.fruta = true
            this.planetas = false
            this.futbolistas = false
            var posibilidadeslista = (0 until lista1.size)
            var palabraleatorio = posibilidadeslista.random()
            this.palabraSeDebeAcertar = lista1[palabraleatorio].joinToString("")
            var numero = this.palabraSeDebeAcertar.length
            println("\u001B[1m"+"\u001B[34m" + "Una palabra relacionada con fruta que contiene $numero letras" + "\u001B[0m")
            for (palabraindice in 0 until this.palabraSeDebeAcertar.length) {
                this.palabraDesbloqueado.insert(0, '-')
            }
        }
        if (numeroaleatorio == 2) {
            this.fruta = false
            this.planetas = true
            this.futbolistas = false
            var posibilidadeslista = (0 until lista2.size)
            var palabraleatorio = posibilidadeslista.random()
            this.palabraSeDebeAcertar = lista2[palabraleatorio].joinToString("")
            var numero = this.palabraSeDebeAcertar.length
            println("\u001B[1m"+"\u001B[34m" + "Una palabra relacionada con planetas que contiene $numero letras" + "\u001B[0m")
            for (palabraindice in 0 until this.palabraSeDebeAcertar.length) {
                this.palabraDesbloqueado.insert(0, '-')
            }
        }
        if (numeroaleatorio == 3) {
            this.fruta = true
            this.planetas = false
            this.futbolistas = false
            var posibilidadeslista = (0 until lista3.size)
            var palabraleatorio = posibilidadeslista.random()
            this.palabraSeDebeAcertar = lista3[palabraleatorio].joinToString("")
            var numero = this.palabraSeDebeAcertar.length
            println("\u001B[1m"+"\u001B[34m" + "Una palabra relacionada con futbolistas que contiene $numero letras" + "\u001B[0m")
            for (palabraindice in 0 until this.palabraSeDebeAcertar.length) {
                this.palabraDesbloqueado.insert(0, '-')
            }
        }
    }

    fun comprobacion(palabra: String): Boolean {
        if (this.palabra.lowercase() == this.palabraSeDebeAcertar) {
            println("\u001B[36m" + "\u001B[47m" + "................................GANADOR................................" + "\u001B[0m")
            return true
        } else {
            var palabrabuscamos = this.palabraSeDebeAcertar.toCharArray()
            var palabraqueintroducimos = palabra.lowercase().toCharArray()

            bucle@ for (palabraindice in 0 until palabrabuscamos.size) {
                if (!(palabraindice > palabraqueintroducimos.size)) {
                    for (entrada in palabraindice until palabraqueintroducimos.size) {
                        if (palabrabuscamos[palabraindice] == palabraqueintroducimos[entrada]) {
                            this.palabraDesbloqueado.replace(
                                palabraindice,
                                palabraindice + 1,
                                palabrabuscamos[palabraindice].toString()
                            )
                            continue@bucle
                        }
                        continue@bucle
                    }
                }
            }
            println("\u001B[35m" + "Aciertos: ${this.palabraDesbloqueado}" + "\u001B[0m")

            return false
        }
    }
}



