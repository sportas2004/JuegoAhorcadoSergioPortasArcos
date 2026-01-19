fun main() {
    var enGame: ReproductorMidi? = null
    var tension: ReproductorMidi? = null
    var inicio: ReproductorMidi? = null
    var derrota: ReproductorMidi? = null
    var win: ReproductorMidi? = null
    println("\u001B[1m"  + "\u001B[97m"+"Bienvenido! Tomate tu tiempo para leer las instrucciones..."+"\u001B[0m")
    println("\u001B[1m" + "\u001B[44m" + "\u001B[97m" + "Introduce una palabra relacionada con la temática. Se indicará qué letras están en la posición correcta de la palabra a descubrir." +"\u001B[0m")

    println("--------------------------------------------------------------------------------------------------------------------------------------------")
    println("\u001B[5m" + "\u001B[107m" + "\u001B[32m" + "................................Pulsa..enter..cuando..estes..preparado..Pulsa..'X'..para..desactivar..la..musica................................" + "\u001B[0m")
    inicio = ReproductorMidi("src/mid/PPW-LOAD.mid")
    var entradaporpantalla = readLine()
    var estadoMusica=false
    while (entradaporpantalla != null) {
        if(entradaporpantalla.lowercase().contains('x')){
            estadoMusica=true
        }else{
            estadoMusica=false
        }
        inicio.cerrar()
        enGame?.cerrar()
        tension?.cerrar()
        var partida = Ahorcado()
        var fase = 1
        var palabraporteclado = readLine()!!.trim()
        var estadoMain = false
        while (fase != 8) {
            if (true) {
                if (fase == 1) {
                    win?.cerrar()
                    derrota?.cerrar()
                    inicio.cerrar()
                    if(!estadoMusica){
                        enGame = ReproductorMidi("src/mid/accf-1100.mid")
                    }
                }
                if (fase == 6) {
                    enGame?.cerrar()
                    if(!estadoMusica){
                        tension = ReproductorMidi("src/mid/tension.mid")
                    }

                }
            }

            partida.palabra = palabraporteclado
            var estado = partida.comprobacion(palabraporteclado)
            if (estado) {
                estadoMain = estado
                if(!estadoMusica){
                    win = ReproductorMidi("src/mid/Mirage_Saloon_Act_2_Midi.mid")
                }

                break
            }
            println("\u001B[43m" + "Estado:" + "\u001B[0m")
            DibujoAhorcado.dibujar(fase)
            fase += 1
            if (fase == 8) break


            palabraporteclado = readLine()!!.trim()
        }
        if (!(estadoMain)) {
            tension?.cerrar()
            if(!estadoMusica){
                derrota = ReproductorMidi("src/mid/tetrisgo (1).mid")
            }
            println("\u001B[47m" + "\u001B[31m" + "................................DERROTA................................" + "\u001B[0m")
        }
        println()
        println("\u001B[5m" + "\u001B[107m" + "\u001B[32m" + "................................Pulsa..enter..cuando..estes..preparado..Pulsa..'X'..para..desactivar..la..musica................................" + "\u001B[0m")
        entradaporpantalla = readLine()
    }

}





