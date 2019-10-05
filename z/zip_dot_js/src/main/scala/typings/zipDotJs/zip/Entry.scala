package typings.zipDotJs.zip

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends js.Object {
  var comment: String = js.native
  var compressedSize: Double = js.native
  var crc32: Double = js.native
  var directory: Boolean = js.native
  var filename: String = js.native
  var lastModDate: Date = js.native
  var lastModDateRaw: Double = js.native
  var uncompressedSize: Double = js.native
  def getData(writer: Writer, onend: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getData(
    writer: Writer,
    onend: js.Function1[/* result */ js.Any, Unit],
    onprogress: js.Function2[/* progress */ Double, /* total */ Double, Unit]
  ): Unit = js.native
  def getData(
    writer: Writer,
    onend: js.Function1[/* result */ js.Any, Unit],
    onprogress: js.Function2[/* progress */ Double, /* total */ Double, Unit],
    checkCrc32: Boolean
  ): Unit = js.native
}

