package typings.zipJs.zip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zip.createReader")
@js.native
object createReader extends js.Object {
  def apply(reader: Reader, callback: js.Function1[/* zipReader */ ZipReader, Unit]): Unit = js.native
  def apply(
    reader: Reader,
    callback: js.Function1[/* zipReader */ ZipReader, Unit],
    onerror: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
}

