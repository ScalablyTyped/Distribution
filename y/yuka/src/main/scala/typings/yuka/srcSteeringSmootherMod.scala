package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSteeringSmootherMod {
  
  @JSImport("yuka/src/steering/Smoother", "Smoother")
  @js.native
  /**
    * Constructs a new smoother.
    *
    * @param [count] - The amount of samples the smoother will use to average a vector.
    */
  open class Smoother () extends StObject {
    def this(count: Double) = this()
    
    /**
      * Calculates for the given value a smooth average.
      *
      * @param value - The value to smooth.
      * @param average - The calculated average.
      * @return The calculated average.
      */
    def calculate(value: Vector3, average: Vector3): Vector3 = js.native
    
    /**
      * The amount of samples the smoother will use to average a vector.
      * @default 10
      */
    var count: Double = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
