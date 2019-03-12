package typings
package youtubeDashDlLib.youtubeDashDlMod.youtubedlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Youtubedl extends js.Object {
  def on(event: java.lang.String, func: js.Function1[/* info */ Info, scala.Unit]): this.type
  def pipe(stream: nodeLib.fsMod.WriteStream): this.type
}

object Youtubedl {
  @scala.inline
  def apply(
    on: (java.lang.String, js.Function1[/* info */ Info, scala.Unit]) => Youtubedl,
    pipe: nodeLib.fsMod.WriteStream => Youtubedl
  ): Youtubedl = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), pipe = js.Any.fromFunction1(pipe))
  
    __obj.asInstanceOf[Youtubedl]
  }
}

