package typings.yuka

import typings.yuka.srcMathAabbMod.AABB
import typings.yuka.srcMathHalfEdgeMod.HalfEdge
import typings.yuka.srcMathPolygonMod.Polygon
import typings.yuka.srcMathPolyhedronMod.Polyhedron
import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathConvexHullMod {
  
  @JSImport("yuka/src/math/ConvexHull", "ConvexHull")
  @js.native
  /**
    * Constructs a new convex hull.
    */
  open class ConvexHull () extends Polyhedron {
    
    /**
      * Returns true if the given point is inside this convex hull.
      *
      * @param point - A point in 3D space.
      * @return Whether the given point is inside this convex hull or not.
      */
    def containsPoint(point: Vector3): Boolean = js.native
    
    /**
      * Computes a convex hull that encloses the given set of points. The computation requires
      * at least four points.
      *
      * @param points - An array of 3D vectors representing points in 3D space.
      * @return A reference to this convex hull.
      */
    def fromPoints(points: js.Array[Vector3]): this.type = js.native
    
    /**
      * Returns true if this convex hull intersects with the given AABB.
      *
      * @param aabb - The AABB to test.
      * @return Whether this convex hull intersects with the given AABB or not.
      */
    def intersectsAABB(aabb: AABB): Boolean = js.native
    
    /**
      * Returns true if this convex hull intersects with the given one.
      *
      * @param convexHull - The convex hull to test.
      * @return Whether this convex hull intersects with the given one or not.
      */
    def intersectsConvexHull(convexHull: ConvexHull): Boolean = js.native
    
    /**
      * Whether faces of the convex hull should be merged or not.
      * @default true
      */
    var mergeFaces: Boolean = js.native
  }
  
  @JSImport("yuka/src/math/ConvexHull", "Face")
  @js.native
  open class Face () extends Polygon {
    def this(a: Vector3) = this()
    def this(a: Unit, b: Vector3) = this()
    def this(a: Vector3, b: Vector3) = this()
    def this(a: Unit, b: Unit, c: Vector3) = this()
    def this(a: Unit, b: Vector3, c: Vector3) = this()
    def this(a: Vector3, b: Unit, c: Vector3) = this()
    def this(a: Vector3, b: Vector3, c: Vector3) = this()
    
    var active: Boolean = js.native
    
    def getEdge(i: Double): HalfEdge = js.native
    
    var outside: Vertex | Null = js.native
  }
  
  @JSImport("yuka/src/math/ConvexHull", "Vertex")
  @js.native
  open class Vertex () extends StObject {
    def this(point: Vector3) = this()
    
    var face: Face | Null = js.native
    
    var next: Vertex | Null = js.native
    
    var point: Vector3 = js.native
    
    var prev: Vertex | Null = js.native
  }
  
  @JSImport("yuka/src/math/ConvexHull", "VertexList")
  @js.native
  open class VertexList () extends StObject {
    
    def append(vertex: Vertex): this.type = js.native
    
    def appendChain(vertex: Vertex): this.type = js.native
    
    def clear(): this.type = js.native
    
    def empty(): Boolean = js.native
    
    def first(): Vertex | Null = js.native
    
    var head: Vertex | Null = js.native
    
    def insertAfter(target: Vertex, vertex: Vertex): this.type = js.native
    
    def last(): Vertex | Null = js.native
    
    def remove(vertex: Vertex): this.type = js.native
    
    def removeChain(a: Vertex, b: Vertex): this.type = js.native
    
    var tail: Vertex | Null = js.native
  }
}
