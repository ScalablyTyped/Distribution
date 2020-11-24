package typings.youtubeDl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("youtube-dl", "getThumbs")
@js.native
object getThumbs extends js.Object {
  
  def apply(url: String, callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]): Unit = js.native
  def apply(
    url: String,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
}
