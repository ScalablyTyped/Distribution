package typings
package zipDotJsLib.zipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zip")
@js.native
object ^ extends js.Object {
  var useWebWorkers: scala.Boolean = js.native
  var workerScriptsPath: java.lang.String = js.native
  def createReader(reader: Reader, callback: js.Function1[/* zipReader */ ZipReader, scala.Unit]): scala.Unit = js.native
  def createReader(
    reader: Reader,
    callback: js.Function1[/* zipReader */ ZipReader, scala.Unit],
    onerror: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def createWriter(writer: Writer, callback: js.Function1[/* zipWriter */ ZipWriter, scala.Unit]): scala.Unit = js.native
  def createWriter(
    writer: Writer,
    callback: js.Function1[/* zipWriter */ ZipWriter, scala.Unit],
    onerror: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def createWriter(
    writer: Writer,
    callback: js.Function1[/* zipWriter */ ZipWriter, scala.Unit],
    onerror: js.Function1[/* error */ js.Any, scala.Unit],
    dontDeflate: scala.Boolean
  ): scala.Unit = js.native
}

