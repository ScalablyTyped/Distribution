package typings
package zipkinLib.zipkinMod.zipkinNs.samplerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountingSampler extends Sampler

object CountingSampler {
  @scala.inline
  def apply(
    shouldSample: js.Function1[
      zipkinLib.zipkinMod.zipkinNs.TraceId, 
      zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean]
    ]
  ): CountingSampler = {
    val __obj = js.Dynamic.literal(shouldSample = shouldSample)
  
    __obj.asInstanceOf[CountingSampler]
  }
}

