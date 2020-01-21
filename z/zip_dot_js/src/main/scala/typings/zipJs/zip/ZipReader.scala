package typings.zipJs.zip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zip.ZipReader")
@js.native
class ZipReader () extends js.Object {
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def getEntries(callback: js.Function1[/* entries */ js.Array[Entry], Unit]): Unit = js.native
}

