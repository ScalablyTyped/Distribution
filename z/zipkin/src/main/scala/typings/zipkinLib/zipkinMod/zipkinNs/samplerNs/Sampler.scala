package typings
package zipkinLib.zipkinMod.zipkinNs.samplerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Sampler extends js.Object {
  def shouldSample(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId): zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean]
}

