package typings.youtubeDl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("youtube-dl", "exec")
@js.native
object exec extends js.Object {
  
  /**
    * Call `youtube-dl` with whatever arguments you like.
    */
  def apply(
    url: String,
    args: js.Array[String],
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
}
