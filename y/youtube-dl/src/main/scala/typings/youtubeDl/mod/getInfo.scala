package typings.youtubeDl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-dl", "getInfo")
@js.native
object getInfo extends js.Object {
  def apply(
    url: String,
    args: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* output */ Info, Unit]
  ): Unit = js.native
  def apply(
    url: String,
    args: js.Array[String],
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ Info, Unit]
  ): Unit = js.native
  def apply(url: String, callback: js.Function2[/* err */ js.Any, /* output */ Info, Unit]): Unit = js.native
}

