/**
 *
 *  Copyright (c) 2006, 2019 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     Thales - initial API and implementation
 */

package org.polarsys.capella.core.data.ctx.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CopyCommand.Helper;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.capella.common.model.copypaste.SharedInitializeCopyCommand;
import org.polarsys.capella.core.data.cs.provider.ComponentItemProvider;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.SystemComponent;

/**
 * This is the item provider adapter for a {@link org.polarsys.capella.core.data.ctx.SystemComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemComponentItemProvider
	extends ComponentItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDataComponentPropertyDescriptor(object);
			addDataTypePropertyDescriptor(object);
			addInvolvingCapabilitiesPropertyDescriptor(object);
			addCapabilityInvolvementsPropertyDescriptor(object);
			addInvolvingMissionsPropertyDescriptor(object);
			addMissionInvolvementsPropertyDescriptor(object);
			addRealizedEntitiesPropertyDescriptor(object);
			addRealizingLogicalComponentsPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataComponentPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
		// end-extension-code
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemComponent_dataComponent_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemComponent_dataComponent_feature", "_UI_SystemComponent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CtxPackage.Literals.SYSTEM_COMPONENT__DATA_COMPONENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
		// begin-extension-code
				 null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTypePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
		// end-extension-code
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemComponent_dataType_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemComponent_dataType_feature", "_UI_SystemComponent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CtxPackage.Literals.SYSTEM_COMPONENT__DATA_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
		// begin-extension-code
				 null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Involving Capabilities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvolvingCapabilitiesPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
		// end-extension-code
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemComponent_involvingCapabilities_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemComponent_involvingCapabilities_feature", "_UI_SystemComponent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CtxPackage.Literals.SYSTEM_COMPONENT__INVOLVING_CAPABILITIES,
				 false,
				 false,
				 false,
				 null,
				 null,
		// begin-extension-code
				 null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Capability Involvements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapabilityInvolvementsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
		// end-extension-code
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemComponent_capabilityInvolvements_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemComponent_capabilityInvolvements_feature", "_UI_SystemComponent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CtxPackage.Literals.SYSTEM_COMPONENT__CAPABILITY_INVOLVEMENTS,
				 false,
				 false,
				 false,
				 null,
				 null,
		// begin-extension-code
				 null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Involving Missions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvolvingMissionsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
		// end-extension-code
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemComponent_involvingMissions_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemComponent_involvingMissions_feature", "_UI_SystemComponent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CtxPackage.Literals.SYSTEM_COMPONENT__INVOLVING_MISSIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
		// begin-extension-code
				 null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Mission Involvements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMissionInvolvementsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
		// end-extension-code
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemComponent_missionInvolvements_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemComponent_missionInvolvements_feature", "_UI_SystemComponent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CtxPackage.Literals.SYSTEM_COMPONENT__MISSION_INVOLVEMENTS,
				 false,
				 false,
				 false,
				 null,
				 null,
		// begin-extension-code
				 null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Realized Entities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealizedEntitiesPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
		// end-extension-code
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemComponent_realizedEntities_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemComponent_realizedEntities_feature", "_UI_SystemComponent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CtxPackage.Literals.SYSTEM_COMPONENT__REALIZED_ENTITIES,
				 false,
				 false,
				 false,
				 null,
				 null,
		// begin-extension-code
				 null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Realizing Logical Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealizingLogicalComponentsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
		// end-extension-code
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemComponent_realizingLogicalComponents_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemComponent_realizingLogicalComponents_feature", "_UI_SystemComponent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CtxPackage.Literals.SYSTEM_COMPONENT__REALIZING_LOGICAL_COMPONENTS,
				 false,
				 false,
				 false,
				 null,
				 null,
		// begin-extension-code
				 null));
		// end-extension-code
	}

	/**
	 * This returns SystemComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SystemComponent")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
	 String[] result = new String[] { null };

    	//begin-capella-code
		String label = ((SystemComponent)object).getName();
		//end-capella-code
	  
	
			result[0] = label == null || label.length() == 0 ?
			//begin-capella-code
			"[" + getString("_UI_SystemComponent_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			//end-capella-code

		return result[0];

	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SystemComponent.class)) {
			case CtxPackage.SYSTEM_COMPONENT__DATA_COMPONENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	// begin-capella-code
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createInitializeCopyCommand(EditingDomain domain, EObject owner, Helper helper) {
		return new SharedInitializeCopyCommand(domain, owner, helper);
	}
	// end-capella-code
}