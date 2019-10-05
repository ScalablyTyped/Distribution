package typings.zipDotJs.zip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zip.ZipWriter")
@js.native
class ZipWriter () extends js.Object {
  def add(name: String, reader: Reader, onend: js.Function0[Unit]): Unit = js.native
  def add(
    name: String,
    reader: Reader,
    onend: js.Function0[Unit],
    onprogress: js.Function2[/* progress */ Double, /* total */ Double, Unit]
  ): Unit = js.native
  def add(
    name: String,
    reader: Reader,
    onend: js.Function0[Unit],
    onprogress: js.Function2[/* progress */ Double, /* total */ Double, Unit],
    options: WriteOptions
  ): Unit = js.native
  def close(callback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
}

