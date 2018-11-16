package typings
package youtubeDashDlLib.youtubeDashDlMod.youtubedlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Youtubedl extends js.Object {
  def on(event: java.lang.String, func: js.Function1[/* info */ Info, scala.Unit]): this.type
  def pipe(stream: nodeLib.fsMod.WriteStream): this.type
}

