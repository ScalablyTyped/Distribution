package typings
package zipkinLib.zipkinMod.zipkinNs.samplerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sampler extends js.Object {
  def shouldSample(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId): zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean]
}

object Sampler {
  @scala.inline
  def apply(
    shouldSample: zipkinLib.zipkinMod.zipkinNs.TraceId => zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean]
  ): Sampler = {
    val __obj = js.Dynamic.literal(shouldSample = js.Any.fromFunction1(shouldSample))
  
    __obj.asInstanceOf[Sampler]
  }
}

