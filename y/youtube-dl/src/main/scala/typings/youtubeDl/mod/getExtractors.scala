package typings.youtubeDl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-dl", "getExtractors")
@js.native
object getExtractors extends js.Object {
  def apply(callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]): Unit = js.native
  def apply(
    descriptions: Boolean,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    descriptions: Boolean,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
}

