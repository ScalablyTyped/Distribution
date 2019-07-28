package typings.zipDotJs.zipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zip")
@js.native
object ^ extends js.Object {
  var useWebWorkers: Boolean = js.native
  var workerScriptsPath: String = js.native
  def createReader(reader: Reader, callback: js.Function1[/* zipReader */ ZipReader, Unit]): Unit = js.native
  def createReader(
    reader: Reader,
    callback: js.Function1[/* zipReader */ ZipReader, Unit],
    onerror: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def createWriter(writer: Writer, callback: js.Function1[/* zipWriter */ ZipWriter, Unit]): Unit = js.native
  def createWriter(
    writer: Writer,
    callback: js.Function1[/* zipWriter */ ZipWriter, Unit],
    onerror: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def createWriter(
    writer: Writer,
    callback: js.Function1[/* zipWriter */ ZipWriter, Unit],
    onerror: js.Function1[/* error */ js.Any, Unit],
    dontDeflate: Boolean
  ): Unit = js.native
}

