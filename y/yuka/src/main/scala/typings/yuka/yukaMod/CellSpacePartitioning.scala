package typings.yuka.yukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "CellSpacePartitioning")
@js.native
open class CellSpacePartitioning protected ()
  extends typings.yuka.cellSpacePartitioningMod.CellSpacePartitioning {
  /**
    * Constructs a new spatial index with the given values.
    *
    * @param width - The width of the entire spatial index.
    * @param height - The height of the entire spatial index.
    * @param depth - The depth of the entire spatial index.
    * @param cellsX - The amount of cells along the x-axis.
    * @param cellsY - The amount of cells along the y-axis.
    * @param cellsZ - The amount of cells along the z-axis.
    */
  def this(width: Double, height: Double, depth: Double, cellsX: Double, cellsY: Double, cellsZ: Double) = this()
}
