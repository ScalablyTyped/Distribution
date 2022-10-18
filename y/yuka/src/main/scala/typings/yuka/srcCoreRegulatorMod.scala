package typings.yuka

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreRegulatorMod {
  
  @JSImport("yuka/src/core/Regulator", "Regulator")
  @js.native
  /**
    * Constructs a new regulator.
    *
    * @param [updateFrequency=0] - The amount of updates per second.
    */
  open class Regulator () extends StObject {
    def this(updateFrequency: Double) = this()
    
    /**
      * Returns true if it is time to allow the next update.
      *
      * @return Whether an update is allowed or not.
      */
    def ready(): Boolean = js.native
    
    /**
      * The amount of updates per second.
      * @default 0
      */
    var updateFrequency: Double = js.native
  }
}
