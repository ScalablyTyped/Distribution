package typings.zipJs.zip

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zip.Writer")
@js.native
class Writer () extends js.Object {
  def getData(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def getData(callback: js.Function1[/* data */ js.Any, Unit], onerror: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def init(callback: js.Function0[Unit]): Unit = js.native
  def init(callback: js.Function0[Unit], onerror: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def writeUint8Array(array: Uint8Array, callback: js.Function0[Unit]): Unit = js.native
  def writeUint8Array(array: Uint8Array, callback: js.Function0[Unit], onerror: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
}

