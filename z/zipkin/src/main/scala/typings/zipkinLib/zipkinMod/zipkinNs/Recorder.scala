package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Tracer sends each annotation to a Recorder implementation */

trait Recorder extends js.Object {
  def record(rec: Record): scala.Unit
}

