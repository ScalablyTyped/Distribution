package typings
package zipDotJsLib.zipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zip.ZipWriter")
@js.native
class ZipWriter () extends js.Object {
  def add(name: java.lang.String, reader: Reader, onend: js.Function0[scala.Unit]): scala.Unit = js.native
  def add(
    name: java.lang.String,
    reader: Reader,
    onend: js.Function0[scala.Unit],
    onprogress: js.Function2[/* progress */ scala.Double, /* total */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def add(
    name: java.lang.String,
    reader: Reader,
    onend: js.Function0[scala.Unit],
    onprogress: js.Function2[/* progress */ scala.Double, /* total */ scala.Double, scala.Unit],
    options: WriteOptions
  ): scala.Unit = js.native
  def close(callback: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
}

