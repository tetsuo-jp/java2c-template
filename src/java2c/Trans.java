package java2c;
import java2c.*;
import javaBNF.*;
import javaBNF.Absyn.*;
import C.Absyn.*;

public class Trans
{
	// public static C.Absyn.Stm trans(javaBNF.Absyn.Stm s) {
	// 	return s.accept(new StmVisitor(), null);
	// }

	public static class ProgramFileVisitor implements ProgramFile.Visitor<ProgramFile,Object>
	{
		public javaBNF.Absyn.Prpkg visit(javaBNF.Absyn.Prpkg p, Object arg)
		{ /* Code For Prpkg Goes Here */
			for (String x: p.listident_)
				{ /* ... */ }
			for (Semi x: p.listsemi_)
				{ /* ... */ }
			for (Import x: p.listimport_)
				{ /* ... */ }
			for (TypeDeclT x: p.listtypedeclt_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.ProgF visit(javaBNF.Absyn.ProgF p, Object arg)
		{ /* Code For ProgF Goes Here */
			for (Import x: p.listimport_)
				{ /* ... */ }
			for (TypeDeclT x: p.listtypedeclt_)
				{ /* ... */ }
			return null;
		}
	}

	public static class ImportVisitor implements Import.Visitor<Import,Object>
	{
		public javaBNF.Absyn.ImportN visit(javaBNF.Absyn.ImportN p, Object arg)
		{ /* Code For ImportN Goes Here */
			for (String x: p.listident_)
				{ /* ... */ }
			for (Semi x: p.listsemi_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.ImportA visit(javaBNF.Absyn.ImportA p, Object arg)
		{ /* Code For ImportA Goes Here */
			for (String x: p.listident_)
				{ /* ... */ }
			for (Semi x: p.listsemi_)
				{ /* ... */ }
			return null;
		}
	}
	public static class TypeDeclTVisitor implements TypeDeclT.Visitor<TypeDecl,Object>
	{
		public javaBNF.Absyn.TypeDecl visit(javaBNF.Absyn.TypeDecl p, Object arg)
		{ /* Code For TypeDecl Goes Here */
			p.classheader_.accept(new ClassHeaderVisitor(), arg);
			for (FieldDeclaration x: p.listfielddeclaration_)
				{ /* ... */ }
			return null;
		}
	}
	public static class ClassHeaderVisitor implements ClassHeader.Visitor<ClassHeader,Object>
	{
		public javaBNF.Absyn.ClassDec visit(javaBNF.Absyn.ClassDec p, Object arg)
		{ /* Code For ClassDec Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			//p.ident_;
			return null;
		}
		public javaBNF.Absyn.ClassDecE visit(javaBNF.Absyn.ClassDecE p, Object arg)
		{ /* Code For ClassDecE Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			//p.ident_;
			for (TypeNameT x: p.listtypenamet_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.ClassDecI visit(javaBNF.Absyn.ClassDecI p, Object arg)
		{ /* Code For ClassDecI Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			//p.ident_;
			for (TypeNameT x: p.listtypenamet_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.ClassDecEI visit(javaBNF.Absyn.ClassDecEI p, Object arg)
		{ /* Code For ClassDecEI Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			//p.ident_;
			for (TypeNameT x: p.listtypenamet_1)
				{ /* ... */ }
			for (TypeNameT x: p.listtypenamet_2)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.InterDec visit(javaBNF.Absyn.InterDec p, Object arg)
		{ /* Code For InterDec Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			//p.ident_;
			return null;
		}
		public javaBNF.Absyn.InterDecE visit(javaBNF.Absyn.InterDecE p, Object arg)
		{ /* Code For InterDecE Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			//p.ident_;
			for (TypeNameT x: p.listtypenamet_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.InterDecI visit(javaBNF.Absyn.InterDecI p, Object arg)
		{ /* Code For InterDecI Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			//p.ident_;
			for (TypeNameT x: p.listtypenamet_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.InterDecEI visit(javaBNF.Absyn.InterDecEI p, Object arg)
		{ /* Code For InterDecEI Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			//p.ident_;
			for (TypeNameT x: p.listtypenamet_1)
				{ /* ... */ }
			for (TypeNameT x: p.listtypenamet_2)
				{ /* ... */ }
			return null;
		}
	}
	public static class FieldDeclarationVisitor<R,Object> implements FieldDeclaration.Visitor<FieldDeclaration,Object>
	{
		public javaBNF.Absyn.DvarFD visit(javaBNF.Absyn.DvarFD p, Object arg)
		{ /* Code For DvarFD Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			p.typespec_.accept(new TypeSpecVisitor(), arg);
			for (VarDecl x: p.listvardecl_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.Dmth visit(javaBNF.Absyn.Dmth p, Object arg)
		{ /* Code For Dmth Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			p.typespec_.accept(new TypeSpecVisitor(), arg);
			p.methoddecl_.accept(new MethodDeclVisitor(), arg);
			p.methodbody_.accept(new MethodBodyVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Dmthth visit(javaBNF.Absyn.Dmthth p, Object arg)
		{ /* Code For Dmthth Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			p.typespec_.accept(new TypeSpecVisitor(), arg);
			p.methoddecl_.accept(new MethodDeclVisitor(), arg);
			for (TypeNameT x: p.listtypenamet_)
				{ /* ... */ }
			p.methodbody_.accept(new MethodBodyVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Dconst visit(javaBNF.Absyn.Dconst p, Object arg)
		{ /* Code For Dconst Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			//p.ident_;
			for (Parameter x: p.listparameter_)
				{ /* ... */ }
			p.bodyt_.accept(new BodyTVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Dconstt visit(javaBNF.Absyn.Dconstt p, Object arg)
		{ /* Code For Dconstt Goes Here */
			for (Modifier x: p.listmodifier_)
				{ /* ... */ }
			//p.ident_;
			for (Parameter x: p.listparameter_)
				{ /* ... */ }
			for (TypeNameT x: p.listtypenamet_)
				{ /* ... */ }
			p.bodyt_.accept(new BodyTVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Dblk visit(javaBNF.Absyn.Dblk p, Object arg)
		{ /* Code For Dblk Goes Here */
			p.bodyt_.accept(new BodyTVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Dinnerclass visit(javaBNF.Absyn.Dinnerclass p, Object arg)
		{ /* Code For Dinnerclass Goes Here */
			p.typedeclt_.accept(new TypeDeclTVisitor(), arg);
			return null;
		}
	}
	public static class MethodBodyVisitor implements MethodBody.Visitor<MethodBody,Object>
	{
		public javaBNF.Absyn.IBody visit(javaBNF.Absyn.IBody p, Object arg)
		{ /* Code For IBody Goes Here */
			return null;
		}
		public javaBNF.Absyn.MBody visit(javaBNF.Absyn.MBody p, Object arg)
		{ /* Code For MBody Goes Here */
			p.bodyt_.accept(new BodyTVisitor(), arg);
			return null;
		}
	}
	public static class LVarStatementVisitor implements LVarStatement.Visitor<LVarStatement,Object>
	{
		public javaBNF.Absyn.LVar visit(javaBNF.Absyn.LVar p, Object arg)
		{ /* Code For LVar Goes Here */
			p.typespec_.accept(new TypeSpecVisitor(), arg);
			for (VarDecl x: p.listvardecl_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.LVarf visit(javaBNF.Absyn.LVarf p, Object arg)
		{ /* Code For LVarf Goes Here */
			p.typespec_.accept(new TypeSpecVisitor(), arg);
			for (VarDecl x: p.listvardecl_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.Statem visit(javaBNF.Absyn.Statem p, Object arg)
		{ /* Code For Statem Goes Here */
			p.stm_.accept(new StmVisitor(), arg);
			return null;
		}
	}
	public static class BodyTVisitor implements BodyT.Visitor<BodyT,Object>
	{
		public javaBNF.Absyn.Body visit(javaBNF.Absyn.Body p, Object arg)
		{ /* Code For Body Goes Here */
			for (LVarStatement x: p.listlvarstatement_)
				{ /* ... */ }
			return null;
		}
	}
	public static class StmVisitor implements javaBNF.Absyn.Stm.Visitor<C.Absyn.Stm,Object>
	{
		public C.Absyn.Stm visit(javaBNF.Absyn.Sem p, Object arg)
		{ /* Code For Sem Goes Here */
			return null;
		}
		public C.Absyn.Stm visit(javaBNF.Absyn.Lbl p, Object arg)
		{ /* Code For Lbl Goes Here */
			//p.ident_;
			return null;
		}
		public C.Absyn.Stm visit(javaBNF.Absyn.Case p, Object arg)
		{ /* Code For Case Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Stm visit(javaBNF.Absyn.Dflt p, Object arg)
		{ /* Code For Dflt Goes Here */
			return null;
		}
		public C.Absyn.Stm visit(javaBNF.Absyn.Exps p, Object arg)
		{ /* Code For Exps Goes Here */
			C.Absyn.Exp r = p.exp_.accept(new ExpVisitor(), arg);
			return new C.Absyn.ExprS(new C.Absyn.SexprTwo(r));
		}
		public C.Absyn.Stm visit(javaBNF.Absyn.LV p, Object arg)
		{ /* Code For LV Goes Here */
			for (LVarStatement x: p.listlvarstatement_)
				{ /* ... */ }
			return null;
		}
		public C.Absyn.Stm visit(javaBNF.Absyn.Jmp p, Object arg)
		{ /* Code For Jmp Goes Here */
			p.jumpstm_.accept(new JumpStmVisitor(), arg);
			return null;
		}
		public C.Absyn.Stm visit(javaBNF.Absyn.Grd p, Object arg)
		{ /* Code For Grd Goes Here */
			p.guardstm_.accept(new GuardStmVisitor(), arg);
			return null;
		}
		public C.Absyn.Stm visit(javaBNF.Absyn.Iter p, Object arg)
		{ /* Code For Iter Goes Here */
			p.iterstm_.accept(new IterStmVisitor(), arg);
			return null;
		}
		public C.Absyn.Stm visit(javaBNF.Absyn.Sel p, Object arg)
		{ /* Code For Sel Goes Here */
			p.selectionstm_.accept(new SelectionStmVisitor(), arg);
			return null;
		}
	}
	public static class DeclaratorNameVisitor implements DeclaratorName.Visitor<DeclaratorName,Object>
	{
		public javaBNF.Absyn.DeclName visit(javaBNF.Absyn.DeclName p, Object arg)
		{ /* Code For DeclName Goes Here */
			//p.ident_;
			return null;
		}
		public javaBNF.Absyn.DeclArray visit(javaBNF.Absyn.DeclArray p, Object arg)
		{ /* Code For DeclArray Goes Here */
			//p.ident_;
			for (BracketsOptT x: p.listbracketsoptt_)
				{ /* ... */ }
			return null;
		}
	}
	public static class VarDeclVisitor implements VarDecl.Visitor<VarDecl,Object>
	{
		public javaBNF.Absyn.VDeclAssign visit(javaBNF.Absyn.VDeclAssign p, Object arg)
		{ /* Code For VDeclAssign Goes Here */
			p.declaratorname_.accept(new DeclaratorNameVisitor(), arg);
			p.variableinits_.accept(new VariableInitsVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.VDecl visit(javaBNF.Absyn.VDecl p, Object arg)
		{ /* Code For VDecl Goes Here */
			//p.ident_;
			return null;
		}
	}
	public static class VariableInitsVisitor implements VariableInits.Visitor<VariableInits,Object>
	{
		public javaBNF.Absyn.IExp visit(javaBNF.Absyn.IExp p, Object arg)
		{ /* Code For IExp Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.IEmpt visit(javaBNF.Absyn.IEmpt p, Object arg)
		{ /* Code For IEmpt Goes Here */
			return null;
		}
		public javaBNF.Absyn.IArri visit(javaBNF.Absyn.IArri p, Object arg)
		{ /* Code For IArri Goes Here */
			p.arrayinits_.accept(new ArrayInitsVisitor(), arg);
			return null;
		}
	}
	public static class ArrayInitsVisitor implements ArrayInits.Visitor<ArrayInits,Object>
	{
		public javaBNF.Absyn.Vainit visit(javaBNF.Absyn.Vainit p, Object arg)
		{ /* Code For Vainit Goes Here */
			p.variableinits_.accept(new VariableInitsVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Vai visit(javaBNF.Absyn.Vai p, Object arg)
		{ /* Code For Vai Goes Here */
			p.arrayinits_.accept(new ArrayInitsVisitor(), arg);
			p.variableinits_.accept(new VariableInitsVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Vais visit(javaBNF.Absyn.Vais p, Object arg)
		{ /* Code For Vais Goes Here */
			p.arrayinits_.accept(new ArrayInitsVisitor(), arg);
			return null;
		}
	}
	public static class MethodDeclVisitor implements MethodDecl.Visitor<MethodDecl,Object>
	{
		public javaBNF.Absyn.Mth visit(javaBNF.Absyn.Mth p, Object arg)
		{ /* Code For Mth Goes Here */
			p.declaratorname_.accept(new DeclaratorNameVisitor(), arg);
			for (Parameter x: p.listparameter_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.MthdArr visit(javaBNF.Absyn.MthdArr p, Object arg)
		{ /* Code For MthdArr Goes Here */
			p.methoddecl_.accept(new MethodDeclVisitor(), arg);
			p.bracketsoptt_.accept(new BracketsOptTVisitor(), arg);
			return null;
		}
	}
	public static class ParameterVisitor implements Parameter.Visitor<Parameter,Object>
	{
		public javaBNF.Absyn.Param visit(javaBNF.Absyn.Param p, Object arg)
		{ /* Code For Param Goes Here */
			p.typespec_.accept(new TypeSpecVisitor(), arg);
			p.declaratorname_.accept(new DeclaratorNameVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Pfinal visit(javaBNF.Absyn.Pfinal p, Object arg)
		{ /* Code For Pfinal Goes Here */
			p.typespec_.accept(new TypeSpecVisitor(), arg);
			p.declaratorname_.accept(new DeclaratorNameVisitor(), arg);
			return null;
		}
	}
	public static class SelectionStmVisitor implements SelectionStm.Visitor<SelectionStm,Object>
	{
		public javaBNF.Absyn.Ifone visit(javaBNF.Absyn.Ifone p, Object arg)
		{ /* Code For Ifone Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			p.stm_.accept(new StmVisitor(), arg);
			for (ElseifT x: p.listelseift_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.If visit(javaBNF.Absyn.If p, Object arg)
		{ /* Code For If Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			p.stm_1.accept(new StmVisitor(), arg);
			for (ElseifT x: p.listelseift_)
				{ /* ... */ }
			p.stm_2.accept(new StmVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Switch visit(javaBNF.Absyn.Switch p, Object arg)
		{ /* Code For Switch Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			p.bodyt_.accept(new BodyTVisitor(), arg);
			return null;
		}
	}
	public static class ElseifTVisitor implements ElseifT.Visitor<ElseifT,Object>
	{
		public javaBNF.Absyn.Elseif visit(javaBNF.Absyn.Elseif p, Object arg)
		{ /* Code For Elseif Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			p.stm_.accept(new StmVisitor(), arg);
			return null;
		}
	}
	public static class JumpStmVisitor implements JumpStm.Visitor<JumpStm,Object>
	{
		public javaBNF.Absyn.Break visit(javaBNF.Absyn.Break p, Object arg)
		{ /* Code For Break Goes Here */
			return null;
		}
		public javaBNF.Absyn.Brlabel visit(javaBNF.Absyn.Brlabel p, Object arg)
		{ /* Code For Brlabel Goes Here */
			//p.ident_;
			return null;
		}
		public javaBNF.Absyn.Continue visit(javaBNF.Absyn.Continue p, Object arg)
		{ /* Code For Continue Goes Here */
			return null;
		}
		public javaBNF.Absyn.Continuelabel visit(javaBNF.Absyn.Continuelabel p, Object arg)
		{ /* Code For Continuelabel Goes Here */
			//p.ident_;
			return null;
		}
		public javaBNF.Absyn.Return visit(javaBNF.Absyn.Return p, Object arg)
		{ /* Code For Return Goes Here */
			return null;
		}
		public javaBNF.Absyn.ReturnExp visit(javaBNF.Absyn.ReturnExp p, Object arg)
		{ /* Code For ReturnExp Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Throw visit(javaBNF.Absyn.Throw p, Object arg)
		{ /* Code For Throw Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
	}
	public static class GuardStmVisitor implements GuardStm.Visitor<GuardStm,Object>
	{
		public javaBNF.Absyn.Synchronized visit(javaBNF.Absyn.Synchronized p, Object arg)
		{ /* Code For Synchronized Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			p.bodyt_.accept(new BodyTVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Try visit(javaBNF.Absyn.Try p, Object arg)
		{ /* Code For Try Goes Here */
			p.bodyt_.accept(new BodyTVisitor(), arg);
			for (Catch x: p.listcatch_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.Tryfinally visit(javaBNF.Absyn.Tryfinally p, Object arg)
		{ /* Code For Tryfinally Goes Here */
			p.bodyt_1.accept(new BodyTVisitor(), arg);
			for (Catch x: p.listcatch_)
				{ /* ... */ }
			p.bodyt_2.accept(new BodyTVisitor(), arg);
			return null;
		}
	}
	public static class CatchVisitor implements Catch.Visitor<Catch,Object>
	{
		public javaBNF.Absyn.Catch1 visit(javaBNF.Absyn.Catch1 p, Object arg)
		{ /* Code For Catch1 Goes Here */
			p.typespec_.accept(new TypeSpecVisitor(), arg);
			//p.ident_;
			p.bodyt_.accept(new BodyTVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Catch2 visit(javaBNF.Absyn.Catch2 p, Object arg)
		{ /* Code For Catch2 Goes Here */
			p.typespec_.accept(new TypeSpecVisitor(), arg);
			p.bodyt_.accept(new BodyTVisitor(), arg);
			return null;
		}
	}
	public static class IterStmVisitor implements IterStm.Visitor<IterStm,Object>
	{
		public javaBNF.Absyn.While visit(javaBNF.Absyn.While p, Object arg)
		{ /* Code For While Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			p.stm_.accept(new StmVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Do visit(javaBNF.Absyn.Do p, Object arg)
		{ /* Code For Do Goes Here */
			p.stm_.accept(new StmVisitor(), arg);
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.For visit(javaBNF.Absyn.For p, Object arg)
		{ /* Code For For Goes Here */
			p.forinit_.accept(new ForInitVisitor(), arg);
			for (javaBNF.Absyn.Exp x: p.listexp_1)
				{ /* ... */ }
			for (javaBNF.Absyn.Exp x: p.listexp_2)
				{ /* ... */ }
			p.stm_.accept(new StmVisitor(), arg);
			return null;
		}
	}
	public static class ForInitVisitor implements ForInit.Visitor<ForInit,Object>
	{
		public javaBNF.Absyn.Exprs1 visit(javaBNF.Absyn.Exprs1 p, Object arg)
		{ /* Code For Exprs1 Goes Here */
			for (javaBNF.Absyn.Exp x: p.listexp_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.DVar visit(javaBNF.Absyn.DVar p, Object arg)
		{ /* Code For DVar Goes Here */
			p.typespec_.accept(new TypeSpecVisitor(), arg);
			for (VarDecl x: p.listvardecl_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.DVarf visit(javaBNF.Absyn.DVarf p, Object arg)
		{ /* Code For DVarf Goes Here */
			p.typespec_.accept(new TypeSpecVisitor(), arg);
			for (VarDecl x: p.listvardecl_)
				{ /* ... */ }
			return null;
		}
	}
	public static class ModifierVisitor implements Modifier.Visitor<Modifier,Object>
	{
		public javaBNF.Absyn.Mabstract visit(javaBNF.Absyn.Mabstract p, Object arg)
		{ /* Code For Mabstract Goes Here */
			return null;
		}
		public javaBNF.Absyn.Mfinal visit(javaBNF.Absyn.Mfinal p, Object arg)
		{ /* Code For Mfinal Goes Here */
			return null;
		}
		public javaBNF.Absyn.Mpublic visit(javaBNF.Absyn.Mpublic p, Object arg)
		{ /* Code For Mpublic Goes Here */
			return null;
		}
		public javaBNF.Absyn.Mprotected visit(javaBNF.Absyn.Mprotected p, Object arg)
		{ /* Code For Mprotected Goes Here */
			return null;
		}
		public javaBNF.Absyn.Mprivate visit(javaBNF.Absyn.Mprivate p, Object arg)
		{ /* Code For Mprivate Goes Here */
			return null;
		}
		public javaBNF.Absyn.Mtransient visit(javaBNF.Absyn.Mtransient p, Object arg)
		{ /* Code For Mtransient Goes Here */
			return null;
		}
		public javaBNF.Absyn.Mvolatile visit(javaBNF.Absyn.Mvolatile p, Object arg)
		{ /* Code For Mvolatile Goes Here */
			return null;
		}
		public javaBNF.Absyn.Mnative visit(javaBNF.Absyn.Mnative p, Object arg)
		{ /* Code For Mnative Goes Here */
			return null;
		}
		public javaBNF.Absyn.Msync visit(javaBNF.Absyn.Msync p, Object arg)
		{ /* Code For Msync Goes Here */
			return null;
		}
		public javaBNF.Absyn.Mstatic visit(javaBNF.Absyn.Mstatic p, Object arg)
		{ /* Code For Mstatic Goes Here */
			return null;
		}
	}
	public static class BasicTypeVisitor implements BasicType.Visitor<BasicType,Object>
	{
		public javaBNF.Absyn.Tchar visit(javaBNF.Absyn.Tchar p, Object arg)
		{ /* Code For Tchar Goes Here */
			return null;
		}
		public javaBNF.Absyn.Tshort visit(javaBNF.Absyn.Tshort p, Object arg)
		{ /* Code For Tshort Goes Here */
			return null;
		}
		public javaBNF.Absyn.Tint visit(javaBNF.Absyn.Tint p, Object arg)
		{ /* Code For Tint Goes Here */
			return null;
		}
		public javaBNF.Absyn.Tlong visit(javaBNF.Absyn.Tlong p, Object arg)
		{ /* Code For Tlong Goes Here */
			return null;
		}
		public javaBNF.Absyn.Tfloat visit(javaBNF.Absyn.Tfloat p, Object arg)
		{ /* Code For Tfloat Goes Here */
			return null;
		}
		public javaBNF.Absyn.Tdouble visit(javaBNF.Absyn.Tdouble p, Object arg)
		{ /* Code For Tdouble Goes Here */
			return null;
		}
		public javaBNF.Absyn.Tbyte visit(javaBNF.Absyn.Tbyte p, Object arg)
		{ /* Code For Tbyte Goes Here */
			return null;
		}
		public javaBNF.Absyn.Tboolean visit(javaBNF.Absyn.Tboolean p, Object arg)
		{ /* Code For Tboolean Goes Here */
			return null;
		}
	}
	public static class TypeSpecVisitor implements javaBNF.Absyn.TypeSpec.Visitor<javaBNF.Absyn.TypeSpec,Object>
	{
		public javaBNF.Absyn.ArrayType visit(javaBNF.Absyn.ArrayType p, Object arg)
		{ /* Code For ArrayType Goes Here */
			p.typenamet_.accept(new TypeNameTVisitor(), arg);
			for (BracketsOptT x: p.listbracketsoptt_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.TypeName visit(javaBNF.Absyn.TypeName p, Object arg)
		{ /* Code For TypeName Goes Here */
			p.typenamet_.accept(new TypeNameTVisitor(), arg);
			return null;
		}
	}
	public static class TypeNameTVisitor implements TypeNameT.Visitor<TypeNameT,Object>
	{
		public javaBNF.Absyn.BuiltIn visit(javaBNF.Absyn.BuiltIn p, Object arg)
		{ /* Code For BuiltIn Goes Here */
			p.basictype_.accept(new BasicTypeVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.ClassType visit(javaBNF.Absyn.ClassType p, Object arg)
		{ /* Code For ClassType Goes Here */
			for (String x: p.listident_)
				{ /* ... */ }
			return null;
		}
	}
	public static class BracketsOptTVisitor implements BracketsOptT.Visitor<BracketsOptT,Object>
	{
		public javaBNF.Absyn.BracketsOpt visit(javaBNF.Absyn.BracketsOpt p, Object arg)
		{ /* Code For BracketsOpt Goes Here */
			return null;
		}
	}
	public static class ExpVisitor implements javaBNF.Absyn.Exp.Visitor<C.Absyn.Exp,Object>
	{
		public C.Absyn.Exp visit(javaBNF.Absyn.Eassign p, Object arg)
		{ /* Code For Eassign Goes Here */
			C.Absyn.Exp r1 = p.exp_1.accept(new ExpVisitor(), arg);
			C.Absyn.Assignment_op r2 = p.assignment_op_.accept(new Assignment_opVisitor(), arg);
			C.Absyn.Exp r3 = p.exp_2.accept(new ExpVisitor(), arg);
			return new C.Absyn.Eassign(r1,r2,r3);
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Etype p, Object arg)
		{ /* Code For Etype Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			p.typenamet_.accept(new TypeNameTVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Econdition p, Object arg)
		{ /* Code For Econdition Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			p.exp_3.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Elor p, Object arg)
		{ /* Code For Elor Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Eland p, Object arg)
		{ /* Code For Eland Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Ebitor p, Object arg)
		{ /* Code For Ebitor Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Ebitexor p, Object arg)
		{ /* Code For Ebitexor Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Ebitand p, Object arg)
		{ /* Code For Ebitand Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Eeq p, Object arg)
		{ /* Code For Eeq Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Eneq p, Object arg)
		{ /* Code For Eneq Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Elthen p, Object arg)
		{ /* Code For Elthen Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Egrthen p, Object arg)
		{ /* Code For Egrthen Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Ele p, Object arg)
		{ /* Code For Ele Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Ege p, Object arg)
		{ /* Code For Ege Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Eleft p, Object arg)
		{ /* Code For Eleft Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Eright p, Object arg)
		{ /* Code For Eright Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Etrip p, Object arg)
		{ /* Code For Etrip Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Eplus p, Object arg)
		{ /* Code For Eplus Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Eminus p, Object arg)
		{ /* Code For Eminus Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Etimes p, Object arg)
		{ /* Code For Etimes Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Ediv p, Object arg)
		{ /* Code For Ediv Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Emod p, Object arg)
		{ /* Code For Emod Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Ebcoercion p, Object arg)
		{ /* Code For Ebcoercion Goes Here */
			p.basictype_.accept(new BasicTypeVisitor(), arg);
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Eexpcoercion p, Object arg)
		{ /* Code For Eexpcoercion Goes Here */
			p.exp_1.accept(new ExpVisitor(), arg);
			p.exp_2.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Earrcoercion p, Object arg)
		{ /* Code For Earrcoercion Goes Here */
			for (String x: p.listident_)
				{ /* ... */ }
			for (BracketsOptT x: p.listbracketsoptt_)
				{ /* ... */ }
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Epreop p, Object arg)
		{ /* Code For Epreop Goes Here */
			p.unary_operator_.accept(new Unary_operatorVisitor(), arg);
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Epreinc p, Object arg)
		{ /* Code For Epreinc Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Epredec p, Object arg)
		{ /* Code For Epredec Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Epostinc p, Object arg)
		{ /* Code For Epostinc Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Epostdec p, Object arg)
		{ /* Code For Epostdec Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Especname p, Object arg)
		{ /* Code For Especname Goes Here */
			p.specname_.accept(new SpecNameVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Earr p, Object arg)
		{ /* Code For Earr Goes Here */
			p.arracc_.accept(new ArrAccVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Emth p, Object arg)
		{ /* Code For Emth Goes Here */
			p.mthcall_.accept(new MthCallVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Efld p, Object arg)
		{ /* Code For Efld Goes Here */
			p.fieldacc_.accept(new FieldAccVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Econst p, Object arg)
		{ /* Code For Econst Goes Here */
			C.Absyn.Constant r = p.constant_.accept(new ConstantVisitor(), arg);
			return new C.Absyn.Econst(r);
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Estring p, Object arg)
		{ /* Code For Estring Goes Here */
			//p.string_;
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Enewalloc p, Object arg)
		{ /* Code For Enewalloc Goes Here */
			p.newalloc_.accept(new NewAllocVisitor(), arg);
			return null;
		}
		public C.Absyn.Exp visit(javaBNF.Absyn.Evar p, Object arg)
		{
			C.Absyn.Evar var = null;

			// p.listident_ にちょうど1つの要素があると仮定する
			for (String x: p.listident_) {
				var = new C.Absyn.Evar(x);
			}
			return var;
		}
	}
	public static class SpecNameVisitor implements SpecName.Visitor<SpecName,Object>
	{
		public javaBNF.Absyn.SSsuper visit(javaBNF.Absyn.SSsuper p, Object arg)
		{ /* Code For SSsuper Goes Here */
			return null;
		}
		public javaBNF.Absyn.SSthis visit(javaBNF.Absyn.SSthis p, Object arg)
		{ /* Code For SSthis Goes Here */
			return null;
		}
		public javaBNF.Absyn.SSnull visit(javaBNF.Absyn.SSnull p, Object arg)
		{ /* Code For SSnull Goes Here */
			return null;
		}
	}
	public static class NewAllocVisitor implements NewAlloc.Visitor<NewAlloc,Object>
	{
		public javaBNF.Absyn.Anewclass visit(javaBNF.Absyn.Anewclass p, Object arg)
		{ /* Code For Anewclass Goes Here */
			p.typenamet_.accept(new TypeNameTVisitor(), arg);
			p.argst_.accept(new ArgsTVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Anewinnerclass visit(javaBNF.Absyn.Anewinnerclass p, Object arg)
		{ /* Code For Anewinnerclass Goes Here */
			p.typenamet_.accept(new TypeNameTVisitor(), arg);
			p.argst_.accept(new ArgsTVisitor(), arg);
			for (FieldDeclaration x: p.listfielddeclaration_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.Anewarray visit(javaBNF.Absyn.Anewarray p, Object arg)
		{ /* Code For Anewarray Goes Here */
			p.typenamet_.accept(new TypeNameTVisitor(), arg);
			for (DimExprT x: p.listdimexprt_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.Anewarriempty visit(javaBNF.Absyn.Anewarriempty p, Object arg)
		{ /* Code For Anewarriempty Goes Here */
			p.typenamet_.accept(new TypeNameTVisitor(), arg);
			for (DimExprT x: p.listdimexprt_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.Anewarrinits visit(javaBNF.Absyn.Anewarrinits p, Object arg)
		{ /* Code For Anewarrinits Goes Here */
			p.typenamet_.accept(new TypeNameTVisitor(), arg);
			for (DimExprT x: p.listdimexprt_)
				{ /* ... */ }
			p.arrayinits_.accept(new ArrayInitsVisitor(), arg);
			return null;
		}
	}
	public static class ArrAccVisitor implements ArrAcc.Visitor<ArrAcc,Object>
	{
		public javaBNF.Absyn.Aarr visit(javaBNF.Absyn.Aarr p, Object arg)
		{ /* Code For Aarr Goes Here */
			for (String x: p.listident_)
				{ /* ... */ }
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Aarr1 visit(javaBNF.Absyn.Aarr1 p, Object arg)
		{ /* Code For Aarr1 Goes Here */
			p.specexp_.accept(new SpecExpVisitor(), arg);
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
	}
	public static class SpecExpVisitor implements SpecExp.Visitor<SpecExp,Object>
	{
		public javaBNF.Absyn.Cep visit(javaBNF.Absyn.Cep p, Object arg)
		{ /* Code For Cep Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Cnp visit(javaBNF.Absyn.Cnp p, Object arg)
		{ /* Code For Cnp Goes Here */
			p.specexpnp_.accept(new SpecExpNPVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Cthis visit(javaBNF.Absyn.Cthis p, Object arg)
		{ /* Code For Cthis Goes Here */
			p.specname_.accept(new SpecNameVisitor(), arg);
			return null;
		}
	}
	public static class SpecExpNPVisitor implements SpecExpNP.Visitor<SpecExpNP,Object>
	{
		public javaBNF.Absyn.CNLit visit(javaBNF.Absyn.CNLit p, Object arg)
		{ /* Code For CNLit Goes Here */
			p.constant_.accept(new ConstantVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.CNParr visit(javaBNF.Absyn.CNParr p, Object arg)
		{ /* Code For CNParr Goes Here */
			p.arracc_.accept(new ArrAccVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.CNPmth visit(javaBNF.Absyn.CNPmth p, Object arg)
		{ /* Code For CNPmth Goes Here */
			p.mthcall_.accept(new MthCallVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.CNPfld visit(javaBNF.Absyn.CNPfld p, Object arg)
		{ /* Code For CNPfld Goes Here */
			p.fieldacc_.accept(new FieldAccVisitor(), arg);
			return null;
		}
	}
	public static class MthCallVisitor implements MthCall.Visitor<MthCall,Object>
	{
		public javaBNF.Absyn.Mmth visit(javaBNF.Absyn.Mmth p, Object arg)
		{ /* Code For Mmth Goes Here */
			for (String x: p.listident_)
				{ /* ... */ }
			p.argst_.accept(new ArgsTVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Mmth1 visit(javaBNF.Absyn.Mmth1 p, Object arg)
		{ /* Code For Mmth1 Goes Here */
			p.specexpnp_.accept(new SpecExpNPVisitor(), arg);
			p.argst_.accept(new ArgsTVisitor(), arg);
			return null;
		}
		public javaBNF.Absyn.Mmthspec visit(javaBNF.Absyn.Mmthspec p, Object arg)
		{ /* Code For Mmthspec Goes Here */
			p.specname_.accept(new SpecNameVisitor(), arg);
			p.argst_.accept(new ArgsTVisitor(), arg);
			return null;
		}
	}
	public static class FieldAccVisitor implements FieldAcc.Visitor<FieldAcc,Object>
	{
		public javaBNF.Absyn.Ffvar visit(javaBNF.Absyn.Ffvar p, Object arg)
		{ /* Code For Ffvar Goes Here */
			p.specexp_.accept(new SpecExpVisitor(), arg);
			//p.ident_;
			return null;
		}
		public javaBNF.Absyn.Ffvar1 visit(javaBNF.Absyn.Ffvar1 p, Object arg)
		{ /* Code For Ffvar1 Goes Here */
			p.newalloc_.accept(new NewAllocVisitor(), arg);
			//p.ident_;
			return null;
		}
		public javaBNF.Absyn.Ffthis visit(javaBNF.Absyn.Ffthis p, Object arg)
		{ /* Code For Ffthis Goes Here */
			for (String x: p.listident_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.Fclass visit(javaBNF.Absyn.Fclass p, Object arg)
		{ /* Code For Fclass Goes Here */
			for (String x: p.listident_)
				{ /* ... */ }
			return null;
		}
		public javaBNF.Absyn.Ffclass2 visit(javaBNF.Absyn.Ffclass2 p, Object arg)
		{ /* Code For Ffclass2 Goes Here */
			p.basictype_.accept(new BasicTypeVisitor(), arg);
			return null;
		}
	}
	public static class ArgsTVisitor implements ArgsT.Visitor<ArgsT,Object>
	{
		public javaBNF.Absyn.Args visit(javaBNF.Absyn.Args p, Object arg)
		{ /* Code For Args Goes Here */
			for (javaBNF.Absyn.Exp x: p.listexp_)
				{ /* ... */ }
			return null;
		}
	}
	public static class DimExprTVisitor implements DimExprT.Visitor<DimExprT,Object>
	{
		public javaBNF.Absyn.DimExpr visit(javaBNF.Absyn.DimExpr p, Object arg)
		{ /* Code For DimExpr Goes Here */
			p.exp_.accept(new ExpVisitor(), arg);
			return null;
		}
	}
	public static class ConstantVisitor implements javaBNF.Absyn.Constant.Visitor<C.Absyn.Constant,Object>
	{
		public C.Absyn.Constant visit(javaBNF.Absyn.Efloat p, Object arg)
		{ /* Code For Efloat Goes Here */
			//p.double_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Echar p, Object arg)
		{ /* Code For Echar Goes Here */
			//p.jchar_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Eunicode p, Object arg)
		{ /* Code For Eunicode Goes Here */
			//p.unicodechar_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Eunsigned p, Object arg)
		{ /* Code For Eunsigned Goes Here */
			//p.unsigned_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Elong p, Object arg)
		{ /* Code For Elong Goes Here */
			//p.long_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Eunsignlong p, Object arg)
		{ /* Code For Eunsignlong Goes Here */
			//p.unsignedlong_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Ehexadec p, Object arg)
		{ /* Code For Ehexadec Goes Here */
			//p.hexadecimal_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Ehexaunsign p, Object arg)
		{ /* Code For Ehexaunsign Goes Here */
			//p.hexunsigned_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Ehexalong p, Object arg)
		{ /* Code For Ehexalong Goes Here */
			//p.hexlong_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Ehexaunslong p, Object arg)
		{ /* Code For Ehexaunslong Goes Here */
			//p.hexunslong_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Eoctal p, Object arg)
		{ /* Code For Eoctal Goes Here */
			//p.octal_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Eoctalunsign p, Object arg)
		{ /* Code For Eoctalunsign Goes Here */
			//p.octalunsigned_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Eoctallong p, Object arg)
		{ /* Code For Eoctallong Goes Here */
			//p.octallong_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Eoctalunslong p, Object arg)
		{ /* Code For Eoctalunslong Goes Here */
			//p.octalunslong_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Ecdouble p, Object arg)
		{ /* Code For Ecdouble Goes Here */
			//p.jdouble_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Ecfloat p, Object arg)
		{ /* Code For Ecfloat Goes Here */
			//p.jfloat_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Eclongdouble p, Object arg)
		{ /* Code For Eclongdouble Goes Here */
			//p.jlongdouble_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Eint p, Object arg)
		{ /* Code For Eint Goes Here */
			return new C.Absyn.Eint(p.integer_);
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Etrue p, Object arg)
		{ /* Code For Etrue Goes Here */
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Efalse p, Object arg)
		{ /* Code For Efalse Goes Here */
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Elonger p, Object arg)
		{ /* Code For Elonger Goes Here */
			//p.integer_;
			return null;
		}
		public C.Absyn.Constant visit(javaBNF.Absyn.Edouble p, Object arg)
		{ /* Code For Edouble Goes Here */
			//p.double_;
			return null;
		}
	}
	public static class Unary_operatorVisitor implements javaBNF.Absyn.Unary_operator.Visitor<javaBNF.Absyn.Unary_operator,Object>
	{
		public javaBNF.Absyn.Unary_operator visit(javaBNF.Absyn.Plus p, Object arg)
		{ /* Code For Plus Goes Here */
			return null;
		}
		public javaBNF.Absyn.Unary_operator visit(javaBNF.Absyn.Negative p, Object arg)
		{ /* Code For Negative Goes Here */
			return null;
		}
		public javaBNF.Absyn.Unary_operator visit(javaBNF.Absyn.Complement p, Object arg)
		{ /* Code For Complement Goes Here */
			return null;
		}
		public javaBNF.Absyn.Unary_operator visit(javaBNF.Absyn.Logicalneg p, Object arg)
		{ /* Code For Logicalneg Goes Here */
			return null;
		}
	}
	public static class Assignment_opVisitor implements javaBNF.Absyn.Assignment_op.Visitor<C.Absyn.Assignment_op,Object>
	{
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.Assign p, Object arg)
		{
			return new C.Absyn.Assign();
		}
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.AssignMul p, Object arg)
		{ /* Code For AssignMul Goes Here */
			return null;
		}
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.AssignDiv p, Object arg)
		{ /* Code For AssignDiv Goes Here */
			return null;
		}
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.AssignMod p, Object arg)
		{ /* Code For AssignMod Goes Here */
			return null;
		}
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.AssignAdd p, Object arg)
		{ /* Code For AssignAdd Goes Here */
			return null;
		}
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.AssignSub p, Object arg)
		{ /* Code For AssignSub Goes Here */
			return null;
		}
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.AssignLeft p, Object arg)
		{ /* Code For AssignLeft Goes Here */
			return null;
		}
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.AssignRight p, Object arg)
		{ /* Code For AssignRight Goes Here */
			return null;
		}
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.AssignTrip p, Object arg)
		{ /* Code For AssignTrip Goes Here */
			return null;
		}
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.AssignAnd p, Object arg)
		{ /* Code For AssignAnd Goes Here */
			return null;
		}
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.AssignXor p, Object arg)
		{ /* Code For AssignXor Goes Here */
			return null;
		}
		public C.Absyn.Assignment_op visit(javaBNF.Absyn.AssignOr p, Object arg)
		{ /* Code For AssignOr Goes Here */
			return null;
		}
	}
	public static class SemiVisitor implements Semi.Visitor<Semi,Object>
	{
		public Semi visit(javaBNF.Absyn.Sem1 p, Object arg)
		{ /* Code For Sem1 Goes Here */
			return null;
		}
	}
}
