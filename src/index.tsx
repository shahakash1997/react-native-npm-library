import { NativeModules } from 'react-native';
import { DateTime } from './DateTime';

type NpmLibraryType = {
  multiply(a: number, b: number): Promise<number>;
  showToast(message: string): void;
};

const { NpmLibrary } = NativeModules;

export default NpmLibrary as NpmLibraryType;

export { DateTime };
