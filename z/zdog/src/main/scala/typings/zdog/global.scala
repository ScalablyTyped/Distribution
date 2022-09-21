package typings.zdog

import typings.zdog.mod.AnchorOptions
import typings.zdog.mod.BoxOptions
import typings.zdog.mod.ConeOptions
import typings.zdog.mod.CylinderOptions
import typings.zdog.mod.DraggerOptions
import typings.zdog.mod.EllipseOptions
import typings.zdog.mod.GroupOptions
import typings.zdog.mod.HemisphereOptions
import typings.zdog.mod.IllustrationOptions
import typings.zdog.mod.PolygonOptions
import typings.zdog.mod.RectOptions
import typings.zdog.mod.RoundedRectOptions
import typings.zdog.mod.ShapeOptions
import typings.zdog.mod.VectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Zdog {
    
    @JSGlobal("Zdog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Zdog.Anchor")
    @js.native
    open class Anchor ()
      extends typings.zdog.mod.Anchor {
      def this(options: AnchorOptions) = this()
    }
    
    @JSGlobal("Zdog.Box")
    @js.native
    open class Box ()
      extends typings.zdog.mod.Box {
      def this(options: BoxOptions) = this()
    }
    
    @JSGlobal("Zdog.Cone")
    @js.native
    open class Cone ()
      extends typings.zdog.mod.Cone {
      def this(options: ConeOptions) = this()
    }
    
    @JSGlobal("Zdog.Cylinder")
    @js.native
    open class Cylinder ()
      extends typings.zdog.mod.Cylinder {
      def this(options: CylinderOptions) = this()
    }
    
    @JSGlobal("Zdog.Dragger")
    @js.native
    open class Dragger ()
      extends typings.zdog.mod.Dragger {
      def this(options: DraggerOptions) = this()
    }
    
    @JSGlobal("Zdog.Ellipse")
    @js.native
    open class Ellipse ()
      extends typings.zdog.mod.Ellipse {
      def this(options: EllipseOptions) = this()
    }
    
    @JSGlobal("Zdog.Group")
    @js.native
    open class Group ()
      extends typings.zdog.mod.Group {
      def this(options: GroupOptions) = this()
    }
    
    @JSGlobal("Zdog.Hemisphere")
    @js.native
    open class Hemisphere ()
      extends typings.zdog.mod.Hemisphere {
      def this(options: HemisphereOptions) = this()
    }
    
    @JSGlobal("Zdog.Illustration")
    @js.native
    open class Illustration protected ()
      extends typings.zdog.mod.Illustration {
      def this(options: IllustrationOptions) = this()
    }
    
    @JSGlobal("Zdog.Polygon")
    @js.native
    open class Polygon ()
      extends typings.zdog.mod.Polygon {
      def this(options: PolygonOptions) = this()
    }
    
    @JSGlobal("Zdog.Rect")
    @js.native
    open class Rect ()
      extends typings.zdog.mod.Rect {
      def this(options: RectOptions) = this()
    }
    
    @JSGlobal("Zdog.RoundedRect")
    @js.native
    open class RoundedRect ()
      extends typings.zdog.mod.RoundedRect {
      def this(options: RoundedRectOptions) = this()
    }
    
    @JSGlobal("Zdog.Shape")
    @js.native
    open class Shape ()
      extends typings.zdog.mod.Shape {
      def this(options: ShapeOptions) = this()
    }
    
    @JSGlobal("Zdog.TAU")
    @js.native
    val TAU: Double = js.native
    
    @JSGlobal("Zdog.Vector")
    @js.native
    open class Vector ()
      extends typings.zdog.mod.Vector {
      def this(position: VectorOptions) = this()
    }
    
    inline def easeInOut(alpha: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(alpha.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOut(alpha: Double, power: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(alpha.asInstanceOf[js.Any], power.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def extend[T](a: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def extend[T](a: T, b: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def lerp(a: Double, b: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def modulo(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
