package typings.youtubeDashDl.youtubeDashDlMod

import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Youtubedl extends js.Object {
  def on(event: String, func: js.Function1[/* info */ Info, Unit]): this.type
  def pipe(stream: WriteStream): this.type
}

object Youtubedl {
  @scala.inline
  def apply(on: (String, js.Function1[/* info */ Info, Unit]) => Youtubedl, pipe: WriteStream => Youtubedl): Youtubedl = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), pipe = js.Any.fromFunction1(pipe))
  
    __obj.asInstanceOf[Youtubedl]
  }
}

