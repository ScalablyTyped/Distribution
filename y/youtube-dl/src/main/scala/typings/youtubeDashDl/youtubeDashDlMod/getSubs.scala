package typings.youtubeDashDl.youtubeDashDlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-dl", "getSubs")
@js.native
object getSubs extends js.Object {
  def apply(url: String, callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]): Unit = js.native
  def apply(
    url: String,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
}

