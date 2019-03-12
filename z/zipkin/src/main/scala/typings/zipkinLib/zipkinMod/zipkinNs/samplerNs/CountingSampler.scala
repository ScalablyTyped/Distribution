package typings
package zipkinLib.zipkinMod.zipkinNs.samplerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountingSampler extends Sampler

object CountingSampler {
  @scala.inline
  def apply(
    shouldSample: zipkinLib.zipkinMod.zipkinNs.TraceId => zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean]
  ): CountingSampler = {
    val __obj = js.Dynamic.literal(shouldSample = js.Any.fromFunction1(shouldSample))
  
    __obj.asInstanceOf[CountingSampler]
  }
}

