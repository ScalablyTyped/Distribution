package typings.zipDotJs.zip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zip.createWriter")
@js.native
object createWriter extends js.Object {
  def apply(writer: Writer, callback: js.Function1[/* zipWriter */ ZipWriter, Unit]): Unit = js.native
  def apply(
    writer: Writer,
    callback: js.Function1[/* zipWriter */ ZipWriter, Unit],
    onerror: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def apply(
    writer: Writer,
    callback: js.Function1[/* zipWriter */ ZipWriter, Unit],
    onerror: js.Function1[/* error */ js.Any, Unit],
    dontDeflate: Boolean
  ): Unit = js.native
}

