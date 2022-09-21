package typings.yuka

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMod {
  
  @JSImport("yuka/src/core/Time", "Time")
  @js.native
  /**
    * Constructs a new time object.
    */
  open class Time () extends StObject {
    
    /**
      * Disables the usage of a fixed delta value.
      */
    def disableFixedDelta(): this.type = js.native
    
    /**
      * Frees all internal resources.
      */
    def dispose(): this.type = js.native
    
    /**
      * Enables the usage of a fixed delta value. Can be useful for debugging and testing.
      */
    def enableFixedDelta(): this.type = js.native
    
    /**
      * Returns the delta time in seconds. Represents the completion time in seconds since
      * the last simulation step.
      *
      * @return The delta time in seconds.
      */
    def getDelta(): Double = js.native
    
    /**
      * Returns the elapsed time in seconds. It's the accumulated
      * value of all previous time deltas.
      *
      * @return The elapsed time in seconds.
      */
    def getElapsed(): Double = js.native
    
    /**
      * Returns the fixed delta time in seconds.
      *
      * @return The fixed delta time in seconds.
      */
    def getFixedDelta(): Double = js.native
    
    /**
      * Returns the timescale value.
      *
      * @return The timescale value.
      */
    def getTimescale(): Double = js.native
    
    /**
      * Resets this time object.
      */
    def reset(): this.type = js.native
    
    /**
      * Sets a fixed time delta value.
      *
      * @param fixedDelta - Fixed time delta in seconds.
      */
    def setFixedDelta(fixedDelta: Double): this.type = js.native
    
    /**
      * Sets a timescale value. This value represents the scale at which time passes.
      * Can be used for slow down or  accelerate the simulation.
      *
      * @param timescale - The timescale value.
      */
    def setTimescale(timescale: Double): this.type = js.native
    
    /**
      * Updates the internal state of this time object.
      */
    def update(): this.type = js.native
  }
}
