package typings
package zipDotJsLib.zipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends js.Object {
  var comment: java.lang.String = js.native
  var compressedSize: scala.Double = js.native
  var crc32: scala.Double = js.native
  var directory: scala.Boolean = js.native
  var filename: java.lang.String = js.native
  var lastModDate: stdLib.Date = js.native
  var lastModDateRaw: scala.Double = js.native
  var uncompressedSize: scala.Double = js.native
  def getData(writer: Writer, onend: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  def getData(
    writer: Writer,
    onend: js.Function1[/* result */ js.Any, scala.Unit],
    onprogress: js.Function2[/* progress */ scala.Double, /* total */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def getData(
    writer: Writer,
    onend: js.Function1[/* result */ js.Any, scala.Unit],
    onprogress: js.Function2[/* progress */ scala.Double, /* total */ scala.Double, scala.Unit],
    checkCrc32: scala.Boolean
  ): scala.Unit = js.native
}

