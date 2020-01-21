package typings.youtubeDl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-dl", "exec")
@js.native
object exec extends js.Object {
  def apply(
    url: String,
    args: js.Array[String],
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
}

