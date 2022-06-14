/**
 * 
 */
package de.validas.spedit.ui.editor.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.validas.spedit.ui.model.NaturalLangEditorPlugin;

/**
 * @author Felix Schaller
 *
 */
public class NlxEObjectNodeItemProvider extends ItemProviderAdapter implements ITreeItemContentProvider, IItemPropertySource {

	private Image image;
	
	private EObjectNode eObject;
	
	protected XtextResource xtextResource;
	
    protected AdapterFactory eObjectAdapterFactory;

	/**
	 * @param adapterFactory
	 */
	public NlxEObjectNodeItemProvider(AdapterFactory adapterFactory, AdapterFactory eObjectAdapterFactory, Object object) {
		super(adapterFactory);
		this.adapterFactory = adapterFactory;
		
		this.eObjectAdapterFactory = eObjectAdapterFactory;
		
		if (object instanceof EObjectNode) {
			eObject = (EObjectNode) object;
			
			IXtextDocument xtextDocument = eObject.getDocument();
			
			xtextResource = xtextDocument.readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
		         public XtextResource exec(XtextResource state) throws Exception {
		                 return state;
		                 }
		         });

			setTarget(xtextResource);
		
		}
	}
	
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

//			addNodeTypePropertyDescriptor(object);
			addTextPropertyDescriptor(object);
			addURIPropertyDescriptor(object);
			addParentPropertyDescriptor(object);
			addChildrenPropertyDescriptor(object);
			addEClassPropertyDescriptor(object);
			addTextRegionPropertyDescriptor(object);
			addEObjectDescriptor(object);
			// TODO: Fix EObject Attributes
			
		}
		return itemPropertyDescriptors;
	}

	protected void addEObjectDescriptor(Object object) {
		
		if (object instanceof EObjectNode) { 
			
			EObject attachedEObject = ((EObjectNode) object).getEObject(xtextResource);
			
			EStructuralFeature feature = attachedEObject != null?attachedEObject.eClass().getEStructuralFeature(0):null;
			
			if (feature == null) return;
		
			itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)eObjectAdapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EObject_description_feature"),
				 getString("_UI_EObject_description", "_UI_EObject_description_feature", "_UI_EObject_type"),
				 feature,
				 true,
				 false,
				 false,
				 feature,
				 null,
				 null,
				 attachedEObject));
		}
	}

	protected void addShortTextRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(createItemPropertyDescriptor
			(adapterFactory,
			 getResourceLocator(),
			 getString("_UI_ShortTextRegion_description_feature"),
			 getString("_UI_ShortTextRegion_description", "_UI_ShortTextRegion_description_feature", "_UI_ShortTextRegion_type"),
			 null,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			 null,
			 null));
		
	}

	protected void addTextRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(createItemPropertyDescriptor
			(adapterFactory,
			 getResourceLocator(),
			 getString("_UI_TextRegion_description_feature"),
			 getString("_UI_TextRegion_description", "_UI_TextRegion_description_feature", "_UI_TextRegion_type"),
			 null,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			 null,
			 null));
		
	}

	private void addEClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(createItemPropertyDescriptor
			(adapterFactory,
			 getResourceLocator(),
			 getString("_UI_EClass_description_feature"),
			 getString("_UI_EClass_description", "_UI_EClass_description_feature", "_UI_EClass_type"),
			 null,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			 null,
			 null));
		
	}

	protected void addSignificantTextRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(createItemPropertyDescriptor
			(adapterFactory,
			 getResourceLocator(),
			 getString("_UI_TextRegion_description_feature"),
			 getString("_UI_TextRegion_description", "_UI_TextRegion_description_feature", "_UI_TextRegion_type"),
			 null,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			 null,
			 null));
		// TODO: replace Literals with correct reference
		
	}

	protected void addFullTextRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(createItemPropertyDescriptor
			(adapterFactory,
			 getResourceLocator(),
			 getString("_UI_FullText_description_feature"),
			 getString("_UI_FullText_description", "_UI_FullText_description_feature", "_UI_FullText_type"),
			 null,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			 null,
			 null));
		// TODO: replace Literals with correct reference
		
	}

	protected void addChildrenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(createItemPropertyDescriptor
			(adapterFactory,
			 getResourceLocator(),
			 getString("_UI_Children_description_feature"),
			 getString("_UI_Children_description", "_UI_Children_description_feature", "_UI_Children_type"),
			 null,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			 null,
			 null));
		// TODO: replace Literals with correct reference
		
	}

	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(createItemPropertyDescriptor
			(adapterFactory,
			 getResourceLocator(),
			 getString("_UI_Parent_description_feature"),
			 getString("_UI_Parent_description", "_UI_Parent_description_feature", "_UI_Parent_type"),
			 null,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			 null,
			 null));
		// TODO: replace Literals with correct reference
		
	}

	protected void addURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(createItemPropertyDescriptor
			(adapterFactory,
			 getResourceLocator(),
			 getString("_UI_URI_description_feature"),
			 getString("_UI_URI_description", "_UI_URI_description_feature", "_UI_URI_type"),
			 null,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			 null,
			 null));
		// TODO: replace Literals with correct reference
		
	}

	protected void addTextPropertyDescriptor(Object object) {
		
		//EClass = NaturalLangPackageImpl.createEClass(EcorePackage.EATTRIBUTE)
		//EAttribute attrFeature = EcoreUtil.create()
		
		//TODO: Get feature from EObject
		
		itemPropertyDescriptors.add
		(createItemPropertyDescriptor
			(adapterFactory,
			 getResourceLocator(),
			 getString("_UI_Text_description_feature"),
			 getString("_UI_Text_description", "_UI_Text_description_feature", "_UI_Text_type"),
			 null,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			 null,
			 null));
		// TODO: replace Literals with correct reference
	}

	protected void addNodeTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(createItemPropertyDescriptor
			(adapterFactory,
			 getResourceLocator(),
			 getString("_UI_Node_Type_feature"),
			 getString("_UI_Node_Type_description", "_UI_Node_Type_feature", "_UI_Node_Type_type"),
			 null,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			 null,
			 null));
		
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createItemPropertyDescriptor(org.eclipse.emf.common.notify.AdapterFactory, org.eclipse.emf.common.util.ResourceLocator, java.lang.String, java.lang.String, org.eclipse.emf.ecore.EStructuralFeature, boolean, boolean, boolean, java.lang.Object, java.lang.String, java.lang.String[], java.lang.Object)
	 */
	@Override
	protected ItemPropertyDescriptor createItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category,
			String[] filterFlags, Object propertyEditorFactory) {
		return new NlxItemPropertyDescriptor
	        (adapterFactory,
	         resourceLocator,
	         displayName,
	         description,
	         feature,
	         isSettable,
	         multiLine,
	         sortChoices,
	         staticImage,
	         category,
	         filterFlags,
	         propertyEditorFactory);
	}

	@Override
	public String getText(Object object) {
		String label = (String) ((EObjectNode)object).getText();
		return label == null || label.length() == 0 ?
			getString("_UI_EObjectNode_type") + " <unnamed>":
			getString("_UI_EObjectNode_type") + " " + label;
	}
	
	public EObject getEObject(Object object) {
		return ((EObjectNode)object).getEObject(xtextResource);
	}
	
	public URI getEObjectURI(Object object) {
		return ((EObjectNode)object).getEObjectURI();
	}

	@Override
	public Image getImage(Object object) {

		return ((EObjectNode)object).getImage();
	}

	@Override
	public IOutlineNode getParent(Object object) {

		return ((EObjectNode)object).getParent();
	}

	@Override
	public List<IOutlineNode> getChildren(Object object) {
		return ((EObjectNode)object).getChildren();
	}

	@Override
	public boolean hasChildren(Object object) {

//		return !children.isEmpty() ? true: false;
		return ((EObjectNode)object).hasChildren();
		
	}

	public ITextRegion getFullTextRegion(Object object) {

		return ((EObjectNode)object).getFullTextRegion();
	}

	public ITextRegion getSignificantTextRegion(Object object) {

		return ((EObjectNode)object).getSignificantTextRegion();
	}
	
	protected ResourceLocator getResourceLocator() {
		return NaturalLangEditorPlugin.INSTANCE;
	}
	
//	private static String getString(String key, Object s1) {
//		return getResourceLocator().getString(key, new Object[] { s1 });
//	}
	

}
