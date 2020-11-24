package typings.zipJs.zip

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reader extends js.Object {
  
  def init(callback: js.Function0[Unit], onerror: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def readUint8Array(index: Double, length: Double, callback: js.Function1[/* result */ Uint8Array, Unit]): Unit = js.native
  def readUint8Array(
    index: Double,
    length: Double,
    callback: js.Function1[/* result */ Uint8Array, Unit],
    onerror: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  
  var size: Double = js.native
}
