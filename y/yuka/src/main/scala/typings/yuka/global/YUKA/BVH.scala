package typings.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.BVH")
@js.native
/**
  * Constructs a new BVH.
  *
  * @param [branchingFactor=2] - The branching factor.
  * @param [primitivesPerNode=1] - The minimum amount of primitives per BVH node.
  * @param [depth=10] - The maximum hierarchical depth.
  */
open class BVH ()
  extends typings.yuka.mod.BVH {
  def this(branchingFactor: Double) = this()
  def this(branchingFactor: Double, primitivesPerNode: Double) = this()
  def this(branchingFactor: Unit, primitivesPerNode: Double) = this()
  def this(branchingFactor: Double, primitivesPerNode: Double, depth: Double) = this()
  def this(branchingFactor: Double, primitivesPerNode: Unit, depth: Double) = this()
  def this(branchingFactor: Unit, primitivesPerNode: Double, depth: Double) = this()
  def this(branchingFactor: Unit, primitivesPerNode: Unit, depth: Double) = this()
}
