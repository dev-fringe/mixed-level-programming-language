package dev.fringe.app

import dev.fringe.service.TrebleService

object TrebleApp {
  def main(args: Array[String]): Unit = print(com.sun.jna.Native.loadLibrary("treble_service", classOf[TrebleService]).asInstanceOf[TrebleService].treble(10))
}
