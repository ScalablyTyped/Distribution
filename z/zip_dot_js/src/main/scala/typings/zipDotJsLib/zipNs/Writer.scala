package typings
package zipDotJsLib.zipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zip.Writer")
@js.native
class Writer () extends js.Object {
  def getData(callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def getData(
    callback: js.Function1[/* data */ js.Any, scala.Unit],
    onerror: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def init(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def init(callback: js.Function0[scala.Unit], onerror: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def writeUint8Array(array: stdLib.Uint8Array, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def writeUint8Array(
    array: stdLib.Uint8Array,
    callback: js.Function0[scala.Unit],
    onerror: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

