package typings.yuka.mod

import typings.yuka.anon.ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "Logger")
@js.native
open class Logger ()
  extends typings.yuka.srcYukaMod.Logger
/* static members */
object Logger {
  
  @JSImport("yuka", "Logger")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yuka", "Logger.LEVEL")
  @js.native
  val LEVEL: ERROR = js.native
  
  /**
    * Logs a message with the level *ERROR*.
    *
    * @param args - The arguments to log.
    */
  inline def error(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Logs a message with the level *LOG*.
    *
    * @param args - The arguments to log.
    */
  inline def log(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the log level for the logger. Allow values are: *LOG*,
    * *WARN*, *ERROR*, *SILENT*. The default level is *WARN*. The constants
    * are accessible over the *Logger.LEVEL* namespace.
    *
    * @param level - The log level.
    */
  inline def setLevel(level: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Logs a message with the level *WARN*.
    *
    * @param args - The arguments to log.
    */
  inline def warn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
